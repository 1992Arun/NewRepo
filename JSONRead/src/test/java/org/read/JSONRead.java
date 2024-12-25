package org.read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONRead {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		
		read();
		
	}
	
	public static void read() throws FileNotFoundException, IOException, ParseException {
		
		JSONParser jp = new JSONParser();
		
		Object parse = jp.parse(new FileReader("C:\\Users\\Arun\\eclipse-workspace\\JSONRead\\src\\test\\resources\\JSON\\read.json"));

		
		JSONObject ob = (JSONObject)parse;
		
		Object emp = ob.get("employee");
		
	     JSONArray emparr = (JSONArray)emp;
	     
	   System.out.println(emparr.get(1));
		
	     Object id = emparr.get(0);   
	     
	     JSONObject id1 = (JSONObject)id;
	     
	  //  System.out.println(id1.get("id"));
	    
	    Object comm = emparr.get(1);   
	     
	//  System.out.println(comm);
	     
	  JSONObject co =(JSONObject)comm;
	     
	// System.out.println(co.get("salary"));
	     
	  Object object = co.get("communication");
	  
	  JSONArray com = (JSONArray)object;
	  
	  Object object2 = com.get(2);
	  
	  JSONObject co2 =(JSONObject)object2;
	  
	//   System.out.println(co2.get("address"));
	      
	   
	   
	   
	
	
	}

}
