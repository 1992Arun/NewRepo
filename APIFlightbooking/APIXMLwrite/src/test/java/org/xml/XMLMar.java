package org.xml;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XMLMar {

	public static void main(String[] args) throws JAXBException {

		marshall();
	}


	public static void marshall() throws JAXBException {

		JAXBContext jb = JAXBContext.newInstance(Students.class);

		Marshaller mar = jb.createMarshaller();

		File loc = new File("newmp1.xml");

		Student wr = new Student();

		wr.setId(212);
		wr.setName("Arun");
		wr.setPhon(9500587985l);

		wr.setAge(20);

		

		Email email = new Email();

		email.setOfficial("arunkumar@cognizant.com");
		email.setPersonal("arunkumar@gmail.com");


		Communication com = new Communication();

		com.setEmail(email);
		
		wr.setCommunication(com);

		Names names = new Names();

		names.setFirstName("Arun");

		names.setLastName("kumar");

		wr.setNames(names);
		
		
	//student 2	
		

		Student wr1 = new Student();

		wr1.setId(792);
		wr1.setName("Kevin");
		wr1.setPhon(9500587985l);

		wr1.setAge(30);

		

		Email email1 = new Email();

		email1.setOfficial("kevin@cognizant.com");
		email1.setPersonal("kevin@gmail.com");


		Communication com1 = new Communication();
		
		wr1.setCommunication(com1);

		com1.setEmail(email1);

		Names names1 = new Names();

		names1.setFirstName("Kevin");

		names1.setLastName("k");


		wr1.setNames(names1);
	
		List<Student> d= new LinkedList<Student>();

		  d.add(wr);
		  d.add(wr1);
       
		  Students s = new Students();
		  
		  s.setStudent(d);
		  
		  mar.marshal(s, loc);

		


	}

}
