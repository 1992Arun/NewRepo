package org.wrapper;

public class WrapperClass {
	
	public static void main(String[] args) {
	
	int num = 7;
	
	Integer num1 = new Integer(num);
	
	Integer num2 = num;
	
	System.out.println(num1);
	System.out.println(num2);
	
	Integer num4= 5;
	
	int num3= num4.intValue();
	
	int num5 = num4 ;
	;
	
	System.out.println(num3);
	System.out.println(num5);
	
	String s = "1323.44";
	
	double n = Double.parseDouble(s);
	
	System.out.println(n);
	
	String str = "7866221223213233121";
	
	long l= Long.parseLong(str);
	
	System.out.println(l);
	
//	int i= Integer.parseInt(str);
//	
//	System.out.println(i);
			
			
}
	
}
