package org.bank;

public class AxisBank extends BankDetails {
	
 public void saving() {
		
		System.out.println("Savings 8%");
		
		
	}
	
	public void fixed() {
		
		System.out.println("Fixes 10%");
		
		
	}
		public void goldloan() {
			
			System.out.println("loan 10%");
		}
		
		
	
	
	public static void main(String[] args) {
		
		AxisBank a=new AxisBank();
		
		a.fixed();
		a.deposit();
		a.saving();
		
	   a.goldloan();
		
		BankDetails b= new AxisBank();
		
		b.deposit();
		b.saving();
	   
		
	}
}
