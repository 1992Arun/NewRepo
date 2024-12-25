package multi.org;

import java.util.HashMap;
import java.util.Map;

public class C {

	public static void main(String[] args) {
		
		
		String input1 = "Java";
		
		String input2 = "Java";
		
		System.out.println(input1.equals(input2));
	
	String input3=	"Welcome to java class";
	
	
     String[] split = input3.split(" ");
     
       for(String x:split) {
    	   
    	   System.out.println(x);
       }
		
		Map a = new HashMap();
	     
		
		a.put(10, 10);
		a.put(20,20);
		a.put(30,30);
		a.put(40,40);
		a.put(50,50);
		a.put(60,60);
		a.put(10,10);
		a.put(50,50);
		a.put(40,40);
	
	System.out.println(a.keySet());    
		
//		List b = new ArrayList();
//	
//		
//		b.add(100);
//		b.add(200);
//		b.add(300);
//		b.add(400);
//		
//		b.add(500);
//		b.add(600);
//		b.add(700);
//		
//		b.add(8000);
//		
//		
//		
//	
//		b.retainAll(a);
//		
//		System.out.println( b);
		
	}

}
