package org.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement

public class Students {
	
	private List<Student> student;

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public List<Student> getStudent() {
		return student;
	}
	
	
	
	}
