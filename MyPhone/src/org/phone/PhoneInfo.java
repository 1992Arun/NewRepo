package org.phone;


public class PhoneInfo   {

	public void phone(String name) {
		
		System.out.println("name");
	}
	
	public void phone(String name, int ram) {
		
		System.out.println(name+"\n"+ram);
	}
	
	public void phone(int ram, String name) {
		
		System.out.println(name+ "\t" +ram);
	}
	
	public static void main(String[] args) {
	
	PhoneInfo p = new PhoneInfo();
	
	p.phone(12, "Arun");
	
	}
	 
	
}
