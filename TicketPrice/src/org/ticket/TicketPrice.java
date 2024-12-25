package org.ticket;

import java.util.Scanner;

public class TicketPrice {
	
	public static void main(String[] args) {
		
		
//		Calculate the price of a movie ticket based on the customer's age and whether it's a weekend. 
//		The pricing is as follows:
//
//			Children (under 13 years): Rs. 100 on weekdays, Rs. 120 on weekends.
//			Adults (13 to 64 years): Rs. 150 on weekdays, Rs. 180 on weekends.
//			Seniors (65 years and above): Rs. 130 on weekdays, Rs. 150 on weekends.
		
		Scanner sc = new Scanner(System.in);
		
		
//		
		System.out.println("Enter age");
		
		int age = sc.nextInt();
				
		
		System.out.println("Enter If it is Weekend");
		
		boolean Weekend = sc.nextBoolean();
		
		if (age <= 13) {
			
			if (Weekend==true ) {
				
				System.out.println("Ticker price is 120");
			}
			
			else {
				
				System.out.println("Ticker price is 100");
			}
			
		}
		
		
		else if (age >=13 & age <=64) {
			
           if (Weekend==true ) {
				
				System.out.println("Ticker price is 180");
			}
			
			else {
				
				System.out.println("Ticker price is 150"); 
			
			
		}
		
	}

		else	if (age >=65) {
			
	           if (Weekend==true ) {
					
					System.out.println("Ticker price is 150");
				}
				
				else {
					
					System.out.println("Ticker price is 130"); 
		
}
}
		
}
	
}
