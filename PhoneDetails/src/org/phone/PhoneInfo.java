package org.phone;

import org.allvehical.FourWheeler;

public class PhoneInfo extends FourWheeler  {
	
	public void processorName() {
		
		System.out.println("SnapDragon");
	}
	
	public void ramSize() {
		
		System.out.println("4GB");
	}
	
	public static void main(String[] args) {
	
	PhoneInfo P1= new PhoneInfo();
	
	P1.processorName();
	P1.ramSize();
	P1.car();
	P1.andrapradesh();
	
	}
	  

}
