package org.xml;

import javax.xml.bind.annotation.XmlType;

//@XmlRootElement
@XmlType(propOrder= {"id","name","age","names","communication","phon","email"})
public class Student {
	
	private int id;
	private String name;
	private long phon;
	
	private int age;
	
	private Communication communication;
	
	private Email email;
	
	private Names names;
	
	
	
	
	public void setCommunication(Communication communication) {
		this.communication = communication;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public void setNames(Names names) {
		this.names = names;
	}

	public Communication getCommunication() {
		return communication;
	}

	public Email getEmail() {
		return email;
	}

	public Names getNames() {
		return names;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhon(long l) {
		this.phon = l;
	}
	
	
	public int getAge() {
		return age;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getPhon() {
		return phon;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
