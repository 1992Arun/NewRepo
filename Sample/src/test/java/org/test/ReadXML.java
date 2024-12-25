package org.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadXML {
	
	public static void main(String[] args) throws JAXBException {
		
		xmlRead();
		
	}
	
	
//	JAXB Context
	
	public static void xmlRead() throws JAXBException {
    
	JAXBContext jb = JAXBContext.newInstance(Employee.class);

//	Create unmarshall
	
	
  	  
     Unmarshaller um = jb.createUnmarshaller();
	
//	give file path
     
     File loc = new File("C:\\Users\\Arun\\eclipse-workspace\\Sample\\src\\test\\resources\\XML\\Sample.xml");
     
//	Print values
     
     Object ob = um.unmarshal(loc);
     
     Employee ed =  (Employee)ob;
     
     System.out.println(ed.getId());
     System.out.println(ed.getName());
     System.out.println(ed.getPhone());
     
   
	
	}

}
