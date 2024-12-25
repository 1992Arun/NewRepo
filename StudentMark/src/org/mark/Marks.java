package org.mark;

import java.util.Scanner;

public class Marks {
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Student ID");
		
		int studentId = s.nextInt();
		
		System.out.println("Student ID is"+ studentId);
		
		System.out.println("Enter Student name");
		
		String name = s.next();
		
		System.out.println("Student name is"+ name);
		
		System.out.println("Enter Tamil mark");
		
		int tamil = s.nextInt();
		
		
		System.out.println("Enter Englis mark");
		
		int english = s.nextInt();
		
		System.out.println("Enter Maths mark");
		
		int maths = s.nextInt();
		
		System.out.println("Enter Science mar");
		
		int science = s.nextInt();
		
		System.out.println("Enter Social  mark");
		
		int social = s.nextInt();
		
		int total = tamil+english+maths+science+social;
		
		System.out.println("Total mark is "+ total);
		
		int average = total/5;
		
		System.out.println("Average mark is "+ average);
		
		
		
	}
	
	
	//	studentId
//    studentName
//    Mark1
//    Mark2
//    Mark3
//    Mark4
//    Mark5
//  :Find the total and average of marks


}
