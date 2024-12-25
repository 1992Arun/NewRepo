package org.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSON {
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		
		read();
	}
	
	
	public static void read() throws FileNotFoundException, IOException, ParseException{
		
		
		
		
	//	Object parse = jp.parse(new FileReader("C:\\Users\\Arun\\eclipse-workspace\\JSONTest\\src\\test\\resources\\JSON\\new.json"));
		
	
	
		

		
		JSONParser jp = new JSONParser();

		//Object parse =jp.parse(new File("C:\\Users\\Arun\\eclipse-workspace\\JSONTest\\src\\test\\resources\\JSON\\write.json"));

	//	JSONObject page = (JSONObject)parse;

	//	  JSONParer jp = new JSONParser();

		JSONObject page = new JSONObject();

		page.put("id", "7");

		page.put("email", "arun@gmail.com");

		page.put("First", "Arun");

		page.put("lastname", "kumar");

		JSONObject page1 = new JSONObject();

		page1.put("id", "9");

		page1.put("email", "kevin@gmail.com");

		page1.put("First", "kevin");

		page1.put("lastname", "francies");

		JSONArray ja = new JSONArray();
		
		ja.add(page);
		
		ja.add(page1);

		


		JSONObject page2 = new JSONObject();
		
	

		page2.put("data", ja);

		PrintWriter pw = new PrintWriter(new File("C:\\Users\\Arun\\eclipse-workspace\\JSONTest\\src\\test\\resources\\JSON\\write.json"));

		pw.write(page2.toString());

		pw.flush();
		
		
	}

}
