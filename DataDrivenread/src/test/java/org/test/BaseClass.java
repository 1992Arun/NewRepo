package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browser(String browser) {


		//		if(browser.equalsIgnoreCase("Chrome")) {
		//
		//			driver = new ChromeDriver();
		//
		//		} else if(browser.equalsIgnoreCase("Edger")) {
		//
		//			driver = new EdgeDriver();
		//
		//		}else if(browser.equalsIgnoreCase("Firefox")) {
		//
		//			driver = new FirefoxDriver();
		//		}



		switch(browser){




		case "Chrome" : driver =new ChromeDriver();
		break;


		case "Edger" : driver = new EdgeDriver();
		break;

		case "Firefox" : driver = new FirefoxDriver();
		break;


		}

		return driver;




	}

	public static String getURL(String URL){

		driver.get(URL);

		return URL;


	}

	public static String getCurrectURL() {

		return driver.getCurrentUrl();
	}

	public static void implicitWait(int time){

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

		driver.manage().window().maximize();
	}


	public static String getAttribute(WebElement e) {

		return e.getAttribute("value");
	}

	public static void selectByText(WebElement e, String text) {

		Select s = new Select(e);

		s.selectByVisibleText(text);



	}


	public static void selectByIndex(WebElement e, String month) {

		Select s = new Select(e);

		int parseInt = Integer.parseInt(month);

		s.selectByIndex(parseInt);


	}


	public static void click(WebElement e) {

		Actions a = new Actions(driver);

		a.click(e).perform();
	}


	public static void mouseover(WebElement e) {

		Actions a = new Actions(driver);

		a.moveToElement(e).perform();
	}


	public static void rightClick(WebElement e) {

		Actions a = new Actions(driver);

		a.contextClick(e).perform();
	}


	public static void dragAndDrop(WebElement src, WebElement des) {

		Actions a = new Actions(driver);

		a.dragAndDrop(src, des).perform();




	}

	public static void doubleClick(WebElement e){

		Actions a = new Actions(driver);

		a.doubleClick(e).perform();

	}

	public static void copy() throws AWTException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static void paste() throws AWTException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

	public static String timeStamp() {

		SimpleDateFormat s = new SimpleDateFormat("ss-mm-hh");

		return s.format(new Date());


	}



	public static void clickSaveImage(int num) throws AWTException, InterruptedException{

		Robot r = new Robot();



		for(int i=0; i<num; i++) {

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_V);
		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		StringSelection	FileSelection  = new StringSelection("C:\\Users\\Arun\\Pictures\\");



		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(FileSelection, null);

		sleep(5);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);



		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		sleep(5);

		StringSelection	FileSelection1  = new StringSelection(timeStamp());




		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(FileSelection1, null);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}



	public static void upload(WebElement e) throws AWTException, InterruptedException {

		click(e);

		StringSelection	FileSelection  = new StringSelection("C:\\Users\\Arun\\Pictures\\ima.png");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(FileSelection, null);

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		sleep(5);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);



	}

	public static void download(WebElement e) throws AWTException, InterruptedException {

		click(e);





	}



	public static void sleep(int time) throws InterruptedException{

		Thread.sleep(time*1000);
	}

	
	public static String selectByValue(WebElement e, String value){

		Select s = new Select(e); 

		s.selectByValue(value);

		return value;


	}

	public static void sendKeys(WebElement e, String value){

		e.sendKeys(value);
	}

	public static void jClick(WebElement e){

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("arguments[0].click();", e);


	}

	public static void jsendKeys(WebElement e, String value){

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("arguments[0].value='"+ value +"';", e);


	}


	public static void quit() {

		driver.quit();
	}

	public static void explicitWait(WebElement e, int time){


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));

		wait.until(ExpectedConditions.elementToBeClickable(e));

	}

	public static void clickbytext(List<WebElement> w, int date){


		for(WebElement a:w) {

			String text = a.getText();

			Integer num = Integer.parseInt(text);

			if(num==date) {

				a.click();

			}

		}


	}

	public static void enterKey() throws AWTException{

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}


	public static String  excelData(String name, String sheet, int rowno, int cellno) throws IOException{


		File f= new File("C:\\Users\\Arun\\Desktop\\"+name+".xlsx");


		FileInputStream is = new FileInputStream(f);


		Workbook wb = new XSSFWorkbook(is);

		Sheet sheet1 = wb.getSheet(sheet);


		Row row = sheet1.getRow(rowno);

		int pr = sheet1.getPhysicalNumberOfRows();

		int pc = row.getPhysicalNumberOfCells();

		String value;

		// 		for(int i=0 ; i<pr; i++) {
		// 			
		// 			Row row2 = sheet.getRow(i);
		// 		
		// 		for(int j=0; j<pc; j++) {
		// 			
		// 			System.out.println(row2.getCell(j));
		// 			
		// 		}
		// 		
		// 		}


		//	System.out.println(row);


		Cell cell = row.getCell(cellno);

		int cellType = cell.getCellType();

		System.out.println(cellType);


		if(cellType==1) {

			value = cell.getStringCellValue();

			System.out.println(value);


		} else if(DateUtil.isCellDateFormatted(cell)) {

			Date date = cell.getDateCellValue();

			SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

			value = df.format(date);

			System.out.println(value);

		}

		else {


			double number = cell.getNumericCellValue();

			long l = (long)number;

			value = String.valueOf(l);

			System.out.println(value);


		}


		return value;


	}

	



}