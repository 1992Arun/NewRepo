package org.emp;

public class Employee {
	
	
	int x=10;
	
	
	
	
	public final void empId(int a) {
		
		System.out.println(a);
	}
	
	public void empName(String str) {
		
		System.out.println(str);
	}
	
	public void empDob(int dob) {
		
		System.out.println(dob);
	}
	
	public void empDob(long phon, int dob) {
		System.out.println( phon+"\n"+dob);
	}
	
	public void empDob(int dob, long phon) {
		System.out.println(phon);
	}
	
	
	
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		
		e.empId(323);
//		e.empName("Arun");
//		e.empDob(2024);
//		e.empDob(2024, 3382938203l);
//		e.empDob(3248349834l, 2024);
//		
//		System.out.println(a);
//		Client c = new Client();
//		Client.clientPhone();
//		
		
	}

}
