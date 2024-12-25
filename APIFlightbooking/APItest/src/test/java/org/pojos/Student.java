package org.pojos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	
	private String name;
	
	private String college;
	
	private String degeree;
	
	private String dept;

	public void setName(String name) {
		this.name = name;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public void setDegeree(String degeree) {
		this.degeree = degeree;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	

	public String getName() {
		return name;
	}

	public String getCollege() {
		return college;
	}

	public String getDegeree() {
		return degeree;
	}

	public String getDept() {
		return dept;
	}
	
	
	
}


