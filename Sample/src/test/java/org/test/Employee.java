package org.test;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee	 {
	
	
	 private int id;
	 private String name;
	 private long phone;
	 
	 
	 
	 
	 
	 
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getPhone() {
		return phone;
	}
	 

}
