package org.edu;

public class Arts extends Education {
	
	
	public void bA() {
		
		System.out.println("Its bA course");

	}
	
	public void bBA() {
		
		System.out.println("Its bBA course");
	}
	
	public void ug() {
		
		System.out.println("Its ug course");
	}
	
	public void pg() {
		
		System.out.println("Its pg course");
		
	}
	
	public static void main(String[] args) {
		
		Arts a= new Arts();
		
		a.pg();
		a.bA();
		
		a.ug();
		
		a.pHd();
		
		Education e= new Arts();
		
		e.ug();
		e.pg();
		e.pHd();
		
		
		
		

		
		
	}

}
