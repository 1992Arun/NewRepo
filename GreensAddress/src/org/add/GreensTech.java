package org.add;

import org.phone.PhoneInfo;

public class GreensTech extends PhoneInfo { 
	
	public void greenTambaram() {
		
		System.out.println("Tambaram");
		
	}
	
	public void greenOMR(){
		
		System.out.println("OMR");
		
		
	}
	
	public void greenAdayar() {
		
		System.out.println("Adayar");
		
	}
	
	public void greenVelachery() {
		
		System.out.println("Velachery");
	}
	
	public static void main (String[] args) {
		
		GreensTech G = new GreensTech();
		
		G.greenAdayar();
		G.greenTambaram();
		G.greenOMR();
		G.greenVelachery();
		
		

		
		
	}
	

}
