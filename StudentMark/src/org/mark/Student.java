package org.mark;

import java.util.Scanner;

public class Student {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter student ID");
		
		short id = s.nextShort();
		
		System.out.println(id);
		
		System.out.println("Enter Student name");
		
		String name = s.next();
		
		System.out.println("Student name is "+name);
		
		System.out.println("Enter student Email");
		
		String email = s.next();
		
		System.out.println("Student Email is "+email);
		
		System.out.println("Enter student phoneno");
		
		long phoneno = s.nextLong();
		
		System.out.println("Student phone number is "+phoneno);
		
		
		
	}

}
