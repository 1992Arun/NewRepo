package org.pojos;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLread {
	
	public static void main(String[] args) throws JAXBException {
		
		readXML() ;
		
	}
	
	public static void readXML() throws JAXBException {
		
		JAXBContext jb = JAXBContext.newInstance(Student.class);
		
		Unmarshaller un = jb.createUnmarshaller();
		
		File fl = new File("C:\\Users\\Arun\\eclipse-workspace\\APItest\\src\\test\\resources\\XML\\student.xml");
		
		Object obj = un.unmarshal(fl);
		
		
		Student p = (Student)obj;
		
		System.out.println(p.getDegeree());
		System.out.println(p.getCollege());
		System.out.println(p.getDept());
		System.out.println(p.getName());
	}

}
