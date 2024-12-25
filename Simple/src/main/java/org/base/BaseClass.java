package org.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	
	
	public static WebDriver browserLaunch(String browser ){
		
		if(browser.equalsIgnoreCase("Chrome")) {
			
		    driver = new ChromeDriver();
		
		
		} else if(browser.equalsIgnoreCase("edge")) {
			
				 driver = new EdgeDriver();
			
		}else if(browser.equalsIgnoreCase("Firefox")) {
			
			   driver = new FirefoxDriver();
			
		}
		
		return driver;
		
		}
	
	
	public static void getURL(String url) {

		driver.get(url);

	}
	
	public static void implicitWait(int time){
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		driver.manage().window().maximize();
		
	}
	
	
    public static void Wait(int time) throws InterruptedException {
    	      	
    	Thread.sleep(time*1000);
    }
    
    public static void click(WebElement e){
    	
    	Actions a = new Actions(driver);
    	
    	a.click(e).perform();
    	
    	
    }
    
   public static void movetoElement(WebElement e){
    	
    	Actions a = new Actions(driver);
    	
    	a.moveToElement(e).perform();
    	
    	
    }
   
   
   public static void contextClick(WebElement e){
   	
   	Actions a = new Actions(driver);
   	
   	a.contextClick(e);
   	
   	
   }

   public static void forward(){

	   driver.navigate().forward();


   }

   public static void back(){

	   driver.navigate().back();

   }
   
  public static void select(WebElement e, String text) {
	  
	  Select s = new Select(e);
	  
	  s.selectByVisibleText(text);
	  
  }
  
  public static void alertaccept(){
	  
	   driver.switchTo().alert().accept();
	  
	  
  }
  
public static void alertdismiss(){
	  
	   driver.switchTo().alert().dismiss();
	  
	  
	  
  }
   
	public static void frame(WebElement e){
		
		driver.switchTo().frame(e);
		
		
	}
	
public static void defaultframe(){
		
		driver.switchTo().defaultContent();
		
		
	}
	
	
	
	public static void window( int count){
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		 count=1;
		for(String window:windowHandles) {
			
			if(count==2) {
				driver.switchTo().window(window);
			}
			count++;
		}
		
		
		
	}
	
	public static void sendkeys(WebElement e, String value){
		
		e.sendKeys(value);
		
		
	}
	
	public static String timestamp() {
		
    
		SimpleDateFormat s = new SimpleDateFormat("yyyy-mm-dd hh-mm-ss");
		
		String format = s.format(new Date());
				
		
		return format;
		
		
	}
	
	public static void takescreeshot() throws WebDriverException, IOException {

	
		
		FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("F:\\Arun\\Screenshots\\"+timestamp()+".png") );
	}
	
	
	public static void javascript(WebElement e,String value) {
	
	  ((JavascriptExecutor)driver).executeScript("arguments[0].value='"+ value +"';", e);
	  
	}
	

	public static void javasClick(WebElement e) {
	
	  ((JavascriptExecutor)driver).executeScript("arguments[0].click()", e);
	  
	}

}
