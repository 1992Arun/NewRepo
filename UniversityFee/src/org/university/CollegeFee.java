package org.university;

public class CollegeFee extends UniversityFee {
	
public void ug() {
		
		System.out.println("Four Lakhs");
	}
	
public void pg() {
		
		System.out.println(" 5 lakhs");
	}

public static void main(String[] args) {
	
	CollegeFee f = new CollegeFee();
	
	f.ug();
	f.pg();
	
}

}
