package org.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson {
	
	
	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
		
		Read();
		
	}
	
	
	public static void Read() throws ParseException, FileNotFoundException, IOException {

	JSONParser jp =	new JSONParser();
	
	Object parse = jp.parse(new FileReader("C:\\Users\\Arun\\eclipse-workspace\\JASONObject\\src\\test\\resources\\JSON\\sample.json"));
		
	JSONObject ob = (JSONObject)parse;
	
	Object man = ob.get("manager");
	
	JSONArray ar = (JSONArray)man;
	
	
	Object ma1 = ar.get(0);
	
	JSONObject ob1 = (JSONObject)ma1;
	
	//System.out.println(ob1.get("mfirstName"));
	
	for(Object x:ar) {
		
		JSONObject ob2 = (JSONObject)x;
		
		System.out.println(ob2.get("mfirstName"));
	     System.out.println(ob2.get("mlastName"));
	     
	    
	     
	}
	     
	
	      System.out.println();
	        Object obe = ob.get("employee");
	     
	       JSONArray ear=(JSONArray)obe;
	     
	        for(Object x:ear) {
	    	 
	    	 JSONObject eob= (JSONObject)x;
	    	 
	    	System.out.println(eob.get("efirstName"));
	    	System.out.println(eob.get("elastName"));
	    	 
	     }
	     
	     
	     
	     
	}
	
	
//	Object email = ob.get("email");
//	
//	
//	//System.out.println(email);
//	
//	JSONArray ja =(JSONArray)email;
//	
//	for(Object s:ja) {
//		
//		System.out.println(s);
//	}
//	
////	System.out.println(ja.get(2));
//	
//	System.out.println(ob.get("id"));
//	
//	System.out.println(ob.get("name"));
//	
//	System.out.println(ob.get("phon"));
	
	
	}
	
