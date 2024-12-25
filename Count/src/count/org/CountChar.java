package count.org;

import java.util.Scanner;

public class CountChar {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		
		Scanner sc = new Scanner(System.in);
		
		//aeiou
		
		
		
		String name = sc.next();
		
	        char ch=	name.charAt(2);
				
	        int count =0;
		
	        int Cont=0;
	     String  vow = "aeiou";
	     
				
	       
		
		
		
		for(int i =0; i<name.length(); i++) {
			
						
			if(name.charAt(i)=='a' | name.charAt(i)=='e'| name.charAt(i)== 'i'| name.charAt(i)=='o' | name.charAt(i)=='u') {
					
				
				count++;
			}
			
			else {
				
				
				Cont++;
				
			}
		}
		
		System.out.println(count);
		System.out.println(Cont);
		
	}

}

