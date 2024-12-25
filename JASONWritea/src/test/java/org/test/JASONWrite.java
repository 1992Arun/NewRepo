package org.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JASONWrite {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		write();
		
	}
	
	public static void write() throws FileNotFoundException, IOException, ParseException {
		
		
		JSONParser jp = new JSONParser();
		
	//	JSONObject ob = new JSONObject();
		
		Map ob = new LinkedHashMap();
		
		ob.put("id", 100);
		
		ob.put("name", "Arun");
		
		
		
		
		
		Map email = new LinkedHashMap();
		
		email.put("official", "arun@cognizant.com");
		
		email.put("personal", "arun@gamil.com");
		
		ob.put("eamil", email);
		
		System.out.println(ob);
				
		PrintWriter pw = new PrintWriter("C:\\Users\\Arun\\eclipse-workspace\\JASONWritea\\src\\test\\resources\\JSON\\new.json");
		
		pw.write(ob.toString());
		
		pw.flush();
		
		pw.close();
		
	}

}
