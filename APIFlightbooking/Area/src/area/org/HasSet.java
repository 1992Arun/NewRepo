package area.org;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class HasSet {
	
	public static int empId() {
		
		System.out.println("Enter Employee ID: ");
		
		Scanner sc =  new Scanner(System.in) ;
				
		int	empId= sc.nextInt();
		
		return empId;
	}
	
	
      public static String stdName() {
		
		System.out.println("Enter Employee name: ");
		
		Scanner sc =  new Scanner(System.in) ;
				
			String	stdName= sc.next();
		
		return stdName;
	}
	
public static long stdPhone() {
	
	System.out.println("Enter Employee phone: ");
	
	Scanner sc =  new Scanner(System.in) ;
			
		long	phone= sc.nextLong();
	
	return phone;
}
	
	
	public static void main(String[] args) {
		
		
//		List<Integer> ls = new LinkedList();
		
//		ls.add(100);
//		ls.add(200);
//		ls.add(300);
//		ls.add(400);
//		ls.add(500);
//		
//		ls.add(600);
		
		HasSet s = new HasSet();
		
//		Integer empId = s.empId();
//		
//		String stdName = s.stdName();
		
		
		Set hs = new LinkedHashSet<>();
		
		hs.add(empId());
		hs.add(stdName());
		hs.add(stdPhone());
		hs.add(40);
		hs.add(50);
	    hs.add(60);
	    hs.add(80);
	    hs.add(90);
	    hs.add(10);
	    hs.add(20);
	    
	   // hs.addAll(ls);
	    
	 ////   hs.remove(10);
	    
//	    System.out.println(hs);
//	    
	    for(Object x:hs) {
	    	
	    	System.out.println(x);
	    }
	    
}
}