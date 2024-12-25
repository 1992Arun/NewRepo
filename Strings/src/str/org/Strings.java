package str.org;

public class Strings {
	
	public static void main(String[] args) {
		
		
		String s = "This World is my World";
		
		String s1= "This world is my World";
		
		
		
		System.out.println(s.length());
		
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.charAt(9));
		
		System.out.println(s.indexOf('i'));
		
		System.out.println(s.indexOf("World"));
		
		System.out.println(s.lastIndexOf('i'));
		
		System.out.println(s.lastIndexOf("World"));
		
		System.out.println(s.lastIndexOf('W', 20));
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s);
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.equals(s1));
		
		System.out.println(s.equalsIgnoreCase(s1));
		
		System.out.println(s+s1);
		
		System.out.println(s.replace('W', '@'));
		
		System.out.println(s.replaceAll("World", "Universe"));
		
		String sd[]= s.split(" ");
		
		for(String x:sd) {
			
			System.out.println(x);
			
		}
		
		System.out.println(s.substring(19));
		
		System.out.println(s.substring(1, 19));
		
		
		System.out.println("====================StringLitreal==============");
		
		
		String s4= "Welcome";
		
		System.out.println(s4);
		
		String s5= "Welcom";
		
		String s8= s4.concat(s5);
		
		System.out.println("====================StringLitreal==============");
		
		System.out.println(s8);
		
		
		System.out.println(System.identityHashCode(s4));
		
		System.out.println(System.identityHashCode(s5));
		
		
		
		String s6 = new String("Streets");
		String s7 = new String("Streets");
		
		System.out.println(s6);
		
        System.out.println(System.identityHashCode(s6));
		
		System.out.println(System.identityHashCode(s7));
		
		
		System.out.println(s6.concat(s7)); 
		
		
		System.out.println("============StringBuffer=======");
		
		
		StringBuffer s9 = new StringBuffer("Old value");
		StringBuffer s10 = new StringBuffer("New value");
		
		System.out.println(System.identityHashCode(s9));
		
		System.out.println(System.identityHashCode(s10));
		
		
		System.out.println(s9.append(s10));
		
		System.out.println(System.identityHashCode(s9));
		
		System.out.println("============StringEquals=======");
		
		String s11 ="Arun";
		
		String s12 ="Arun";
		
		 System.out.println(s11==s12);
		 
		boolean equals = s11.equals(s12);
		
		System.out.println(equals);
		
		System.out.println("============StringEquals=======");
		
		String s13 = new String("Arun");
		
		String s14 = new String("Arun");
		
		  System.out.println(s13.equals(s14));
		  
		  System.out.println(s13==s14);
		  
		  System.out.println(System.identityHashCode(s13));
		  
		  System.out.println(System.identityHashCode(s14));
		  
		  
		  String st= new String("1234456778");
		  
		 
		  
		System.out.println(st.length());
		  
		 for(int i=st.length()-1 ; i>0; i--) {
			 
			 System.out.print(st.charAt(i));
			 
			 
			 
		 }

		 
		 System.out.println("=======Sum of number======");
		 System.out.println("=======Sum of number======");
		
		long a= 132398291203l;
		
		long rem=0;
		
		long rev=0;
		
		int count=0;
		
		String st1 = Long.toString(a);
		
		for(int i=0; i<st1.length();i++){
			
			count++;
			
			
		}
		
		long av=0;
		
		System.out.println(count);
		
		while(a!=0) {

              
			rem= a%10;
			
			rev = rev+rem;
			
			a = a/10;	
			
		}
		
		System.out.println(rev);
		
		av= rev/count;
		
		long b=91279372293l;
		
		int counte=0;
		
		while(b>0) {
			
			b=b/10;
			
			counte++;
		}
		
		
		System.out.println(counte);
	}

}
