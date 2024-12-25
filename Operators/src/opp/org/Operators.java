package opp.org;

public class Operators {
	
	public int a ;
	
	public void empid() {
		
		System.out.println(a);
		
	
		
		
	}
		
	
	
	public static void main(String[] args) {
		
		Operators e = new Operators();
		
		System.out.println(e.a);
		
		e.a=20;
		
		
		e.empid();
		
		StringBuffer a = new StringBuffer("Arun");
		
		StringBuffer b= new StringBuffer("Kumar");
		
		//System.out.println(a.append(b));
		
		int identityHashCode = System.identityHashCode(a);
		int identityHashCode2 = System.identityHashCode(b);
		
		System.out.println(identityHashCode);
		
		System.out.println(identityHashCode2);
		
		
		
	}
	}
		
//		int a=10;
//		
//		int b=20;
//		
//		
//		int c=78;
//				
//		int d=90;
//		
//		if( b<d && a>c) {
//			
//			System.out.println("true");
//		}
//		
//		else  {
//			
//			System.out.println("false");
//			
//		}
//	}
//
//}