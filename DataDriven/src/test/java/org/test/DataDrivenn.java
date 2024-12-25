package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataDrivenn extends BaseClass {
	
	
	@BeforeClass
	private void beforeClass() {
		
		
	}
	
	@BeforeMethod
	private void beforeMethod() {
		
		
	}
	
	
	
	@Test
	private void test() throws IOException {
		
		
		
		File f= new File("C:\\Users\\Arun\\Desktop\\DataDriven.xlsx");
		
	
		FileInputStream is = new FileInputStream(f);
		
		
		Workbook wb = new XSSFWorkbook(is);
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		
		Row row = sheet.getRow(1);
		
		int pr = sheet.getPhysicalNumberOfRows();
		
		int pc = row.getPhysicalNumberOfCells();
		
//		for(int i=0 ; i<pr; i++) {
//			
//			Row row2 = sheet.getRow(i);
//		
//		for(int j=0; j<pc; j++) {
//			
//			System.out.println(row2.getCell(j));
//			
//		}
//		
//		}
		
		
	//	System.out.println(row);
		
		
	 Cell cell = row.getCell(3);
	 
	  int cellType = cell.getCellType();
				
        System.out.println(cellType);
        
        
		 if(cellType==1) {
			 
			 String value = cell.getStringCellValue();
			 
			 System.out.println(value);
			 
			 
		 } else if(DateUtil.isCellDateFormatted(cell)) {
			 
			 Date date = cell.getDateCellValue();
			 
			 SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			 
			 String format = df.format(date);
			 
			 System.out.println(format);
			 
		 }
		 
		 else {
			 
			 
			 double number = cell.getNumericCellValue();
			 
			 long l = (long)number;
			 
			 String ph = String.valueOf(l);
			 
			 System.out.println(ph);
			 
		 }
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	@AfterMethod
	private void atereMethod() {
		
		
		
	}

	
	@AfterClass
	private void afterClass() {
		
	
	}
}
