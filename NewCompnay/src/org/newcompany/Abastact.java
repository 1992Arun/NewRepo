package org.newcompany;

import bike.org.Ktm;

public class Abastact extends Ktm {
	
	public void companyAddress() {
		
		System.out.println("Chennai");
		
	}
	
	public static void main(String[] args) {
		
		
		Abastact a = new Abastact();
		
		a.companyAddress();
		
		a.mileage();
		a.tyres();
		
	}
}
