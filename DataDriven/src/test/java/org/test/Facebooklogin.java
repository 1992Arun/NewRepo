package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebooklogin extends Loginpage {
	
	public static Workbook w;
	
	public static Sheet sheet;
 	

	@Test(dataProvider ="login")
	
	public void login(String user, String pass) throws IOException {


		browser("Chrome");

		getURL("https://www.facebook.com/");




		Loginpage l = new Loginpage();



		sendKeys(l.getEmail(), user);


		sendKeys(l.getPass(),  pass);


		click(l.getLogin());




	}


	@Test
	private void data() {




	}


	@Test(enabled=false)
	private void excelRead() throws IOException {

		File f = new File("C:\\Users\\Arun\\Desktop\\NewFile1.xlsx");

		//		FileInputStream is = new FileInputStream(f);



		Workbook wb = new XSSFWorkbook();



		Sheet s = wb.createSheet("Java");

		Row row = s.createRow(0);

		//	Row row = s.getRow(0);

		Cell createCell = row.createCell(0);

		createCell.setCellValue("Ara");

		System.out.println(createCell);

		//		Cell createCell1 = createRow.createCell(1);
		//
		//		createCell.setCellValue("Kevin");
		//
		//		System.out.println(createCell1);

		FileOutputStream fo = new FileOutputStream(f);


		wb.write(fo);

	}



	@DataProvider(name ="login")

	private String[][] excel() throws InvalidFormatException, IOException {

		File f = new File("C:\\Users\\Arun\\Desktop\\NewFile1.xlsx");

		FileInputStream is = new FileInputStream(f);

			 w =  new XSSFWorkbook();

		//     w = WorkbookFactory.create(is);

		   sheet = w.getSheet("Sheet1");



		int rowno = sheet.getPhysicalNumberOfRows();

		int colno = sheet.getRow(0).getLastCellNum();

		String data[][]= new String[rowno][2];

		String value;


		for(int i=1; i<rowno; i++) {

		//	Row row = sheet.getRow(i);

			data[i-1][0]= cell(i, 0);  //username
			
			data[i-1][1]= cell(i, 1);  //password
    

			System.out.println(data[i-1][0]);

		}
		return data;


	}



   
	public static String cell(int row, int coulumn){
		
		String value;
		
		
		
		
//		int rowno = sheet.getPhysicalNumberOfRows();
//
//		int colno = sheet.getRow(row).getLastCellNum();		 
		 
		 Row r = sheet.getRow(row);
		 
		 
		Cell cell = r.getCell(coulumn);

		int cellType = cell.getCellType();


		if (cellType==1) {

			value = cell.getStringCellValue();

		} else if(DateUtil.isCellDateFormatted(cell)) {

			SimpleDateFormat sd = new SimpleDateFormat("dd-MM-YYYY");

			value = sd.format(cell);
			
			System.out.println(value);

		}

		else {

			double num = cell.getNumericCellValue();

			long l = (long)num;


			value = String.valueOf(l);



		}
		return value;
	}



}







