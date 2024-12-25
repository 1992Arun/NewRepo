package org.newpackage;

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


	public static WebDriver browserLaunch(String browser) {

		//		if(browser.equalsIgnoreCase("chrome")) {
		//
		//			WebDriver driver = new ChromeDriver();
		//
		//
		//
		//		}else if(browser.equalsIgnoreCase("edge")) 
		//
		//		{
		//
		//			WebDriver driver = new EdgeDriver();
		//
		//		}
		//
		//
		//		else if(browser.equalsIgnoreCase("firefox")) 
		//
		//		{
		//
		//			WebDriver driver = new FirefoxDriver();
		//
		//		}
		//
		//		

		switch(browser){

		case "Chrome": 

			driver = new ChromeDriver();
			break;


		case "Edge": 

			driver = new EdgeDriver();
			break;


		case "FireFox": 

			driver = new FirefoxDriver();
			break;


		}

		return driver;

	}


	public static void getURL(String url) {

		driver.get(url);



	}

	public static void implicitWait(int time) {

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

	}



	public static void sendKeys(WebElement e, String value) {

		e.sendKeys(value);



	}


	public static void click(WebElement e) {

		e.click();

	}

	public static String getText(WebElement e) {

		String text = e.getText();

		return text;
	}

	public static String getAttribute(WebElement e) {

		String text = e.getAttribute("value");

		return text;
	}


	public static void moveToElement(WebElement e) {


		Actions a = new Actions(driver);

		a.moveToElement(e).perform();

	}


	public static void dragAnddrop(WebElement src, WebElement des ) {


		Actions a = new Actions(driver);

		a.dragAndDrop(src, des);

	}

	public static void quit() {

		driver.quit();

	}

	public static String timeStamp() {



		return new SimpleDateFormat("yyyy-mm-dd hh-mm-ss").format(new Date());

		//return new SimpleDateFormat().format(new Date());
	}

	public static void takeScreenshot() throws WebDriverException, IOException {

		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),  new File("F:\\"+BaseClass.timeStamp()+".png"));
	}


	public static void javascript(WebElement e) {


		((JavascriptExecutor)driver).executeScript("arguments[0].click()", e);


	}

	public static void select(WebElement e, String text) {

		Select s = new Select(e);

		s.selectByVisibleText(text);

	}
	
	
	public static void frame(WebElement e, int index) {
		
		driver.switchTo().frame(index);
		
	}
	
	
public static void window( int num ) {
	
	   int count=1;
	   
	   Set<String> windowHandles = driver.getWindowHandles();
	   
	   for(String eachId: windowHandles) {
		   
		   if(count == num) {
		   
		   driver.switchTo().window(eachId);
		   
		   }
		   
		   count++;
	   }
	   		
	}


	public static void close() {

		driver.close();

	}
	
	public static void sleep(int seconds) throws InterruptedException {
		
		Thread.sleep(seconds);
	}



}
