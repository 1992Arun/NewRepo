package org.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateXL {



	public static void main(String[] args) throws InvalidFormatException, IOException {

		create();

	}


	public static void news() throws InvalidFormatException, IOException {

		File f = new File("C:\\Users\\Arun\\Desktop\\Datadriven\\newd.xlsx");

		//	FileInputStream is = new FileInputStream(f);

		Workbook wb =  new XSSFWorkbook();

		Sheet sheet = wb.createSheet("Courses");

		Row row = sheet.createRow(0);

		Row row1 = sheet.getRow(0);

		Cell cell = row.createCell(0);

		cell.setCellValue("Students");

		Cell cell1 = row1.createCell(1);

		cell1.setCellValue("Courses");

		FileOutputStream os = new FileOutputStream(f);

		wb.write(os);



	}

	public static void create() throws InvalidFormatException, IOException{

		File f = new File("C:\\Users\\Arun\\Desktop\\Datadriven\\Courses.xlsx");

		//	FileInputStream is = new FileInputStream(f);

		Workbook wb =  new XSSFWorkbook();

		Sheet sheet = wb.createSheet("Courses");

		String[][] data = new String[][]{ {"Students", "Course"}, {"Arun", "Java"}, {"Navin","Testing"},{"kevin", "Phython"},
			{"Messi", "Freekick"}, {"Ronaldo", "Penalty"}, };


			for(int i=0; i<data.length; i++) {

				Row row = sheet.createRow(i);

				Row row1 = sheet.getRow(i);

				Cell cell = row.createCell(0);

				cell.setCellValue(data[i][0]);

				Cell cell1 = row1.createCell(1);

				cell1.setCellValue(data[i][1]);


			}


			FileOutputStream os = new FileOutputStream(f);

			wb.write(os);

	}








}


