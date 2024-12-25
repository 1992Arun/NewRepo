package org.pojos;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XMLWrite {
	
	
	public static void main(String[] args) throws JAXBException {
		
		
		marshall1();
		
	}
	
	
	

public static void marshall1() throws JAXBException {
	
	JAXBContext jb = JAXBContext.newInstance(Student.class);
	
	Marshaller mar = jb.createMarshaller();
	
	File loc = new File("C:\\Users\\Arun\\eclipse-workspace\\APItest\\src\\test\\resources\\XML\\new.xml");
	
	Student wr = new Student();
	

	
	wr.setCollege("DESC");
	
	wr.setDegeree("BE");
	
	mar.marshal(wr, loc);
	
	System.out.println("Done");

}

}
