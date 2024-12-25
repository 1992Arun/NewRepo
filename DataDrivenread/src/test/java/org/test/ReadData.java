package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadData extends Loginpage {
	
   public static Workbook wb;
   
   public static Sheet sheet;
	
	
   
   @Test(dataProvider ="login", priority=-10)
	
	public void login(String user, String pass) throws IOException, InterruptedException {


		browser("Chrome");

		getURL("https://www.facebook.com/");




		Loginpage l = new Loginpage();



		sendKeys(l.getEmail(), user);


		sendKeys(l.getPass(),  pass);
		
		


		click(l.getLogin());

		
		sleep(4);
		
			quit();
  


	}
   
   


   @DataProvider(name="login")
	public static String[][] read1() throws InvalidFormatException, IOException {
		
	   File loc= new File("C:\\Users\\Arun\\Desktop\\Datadriven\\NewFile.xlsx");
	   
	//   FileInputStream is = new FileInputStream(loc);
	   
	    wb = WorkbookFactory.create(loc);
	   
	    sheet = wb.getSheet("Java");
	   
	   int rowno = sheet.getPhysicalNumberOfRows();
	   
	   short columno = sheet.getRow(0).getLastCellNum();
	   
	   String data[][] = new String[rowno-1][columno];
	   
	   
	   
	   for(int i=1; i<rowno; i++) {
	   
	   Row row = sheet.getRow(i);
	   
	   
	       data[i-1][0] = cell(i, 0);
	   
	       data[i-1][1] =  cell(i, 1);
	       
//	       data[i-1][2] =  cell(i, 2);
//	       
//	       data[i-1][3] =  cell(i, 3);
//	     
//	       data[i-1][4] =  cell(i, 4);
//	       
//	       data[i-1][6] =  cell(i, 6);
//	   
	   }
	   
	 
	   return data;
	   
	   
	   
	   

	}


   @DataProvider(name="Registration")
	public static String[][] read() throws InvalidFormatException, IOException {
		
	   File loc= new File("C:\\Users\\Arun\\Desktop\\Datadriven\\Registration.xlsx");
	   
	//   FileInputStream is = new FileInputStream(loc);
	   
	    wb = WorkbookFactory.create(loc);
	   
	    sheet = wb.getSheet("Sheet1");
	   
	   int rowno = sheet.getPhysicalNumberOfRows();
	   
	   short columno = sheet.getRow(0).getLastCellNum();
	   
	   String data[][] = new String[rowno-1][columno];
	   
	   for(int i=1; i<rowno; i++) {
	   
	   Row row = sheet.getRow(i);
	   
	   
	       data[i-1][0] = cell(i, 0);
	   
	       data[i-1][1] =  cell(i, 1);
	       
	       data[i-1][2] =  cell(i, 2);
	       
	       data[i-1][3] =  cell(i, 3);
	     
	       data[i-1][4] =  cell(i, 4);
	       
	       data[i-1][6] =  cell(i, 6);
	   
	   }
	   
	 
	   return data;
	   
	   
	   
	   

	}
	
	
	
	public static String cell(int row, int coulmn) {
		
		
		
		Row row2 = sheet.getRow(row);

		String value;
		
		Cell cell = row2.getCell(coulmn);
		
		int cellType = cell.getCellType();
		
		
		
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

	
	
	@Test(enabled= false)
	private void test() throws InvalidFormatException, IOException {
		
		
		File f = new File("C:\\Users\\Arun\\Desktop\\Datadriven\\NewFile.xlsx");
		
		FileInputStream is = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(is);
		
		Sheet sheet2 = wb.getSheet("Java");
		
		int rowno = sheet2.getPhysicalNumberOfRows();
		
		
		
		System.out.println(rowno);
		
		for(int i=1; i<rowno; i++) {
			
			Row row = sheet2.getRow(i);
			
			
			
			for(int j=0; j<row.getLastCellNum(); j++) {
			
			Cell cell = row.getCell(j);
			
			
			String cel = cell.getStringCellValue();
			
			if( cel.equalsIgnoreCase("Yamal")) {
				
				cell.setCellValue("Messi");
			}
			
			}
			
		}
		
		FileOutputStream os = new FileOutputStream(f);
		
		wb.write(os);
		
		System.out.println("Done");
		
		
		
	}

}
