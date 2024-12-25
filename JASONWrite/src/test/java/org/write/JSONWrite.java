package org.write;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class JSONWrite {

	public static void main(String[] args) throws ParseException, FileNotFoundException {

		write();

	}

	public static void write() throws ParseException, FileNotFoundException {


		JSONObject jo = new JSONObject();

		
		JSONObject id = new JSONObject();
		
		id.put("id", 101);
		
		
        JSONObject salary = new JSONObject();
		
		id.put("salary", 1000); 
		
	//System.out.println(id);
		
		


	//	JSONObject pho = new JSONObject();
		
		Map<String, Object> pho = new LinkedHashMap();
		
	

		pho.put("personalPhone", 95005879855l);

		pho.put("officialPhone", 21587876);



//		JSONObject email = new JSONObject();
		
		 Map<String, String> email = new LinkedHashMap();

		 email.put("official", "arunkumar@cognizant.com");

		 email.put("personal", "arunkumar@gmail.com");







//		JSONObject add = new JSONObject();
		
        Map<String, String> add = new LinkedHashMap();

        add.put("parmanentAddress", "Tindivanam");

        add.put("currectAddress", "Chennai");

		JSONArray adda = new JSONArray();

		adda.add(add);


		JSONObject addo = new JSONObject();

		addo.put("address", adda);
		
	

		JSONArray com1 = new JSONArray();

		com1.add(addo);

		com1.add(email);	

		com1.add(pho);
		
		

		JSONObject com = new JSONObject();

		com.put("communication", com1);

		JSONArray ja = new JSONArray();

		ja.add(id);

		ja.add(com);

		
		JSONArray aem = new JSONArray();
		
		 aem.add(ja);
		 
		 com1.add(salary);
		 
		

	//	JSONParser jp = new JSONParser();

		System.out.println( aem.toJSONString());
		
		PrintWriter pw = new PrintWriter("C:\\Users\\Arun\\eclipse-workspace\\JASONWrite\\src\\test\\resources\\JSON\\new.json");
		
		pw.write(aem.toJSONString());
		
		pw.flush();
		
		pw.close();
		


		//jp.parse(ja.toJSONString());




	}

}
