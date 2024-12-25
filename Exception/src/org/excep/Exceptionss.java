package org.excep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Exceptionss {
     
	
 
	public static List listofnum() {
		
		List<Integer> ls = new ArrayList();
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the count");
		
		int count = sc.nextInt();
		
		System.out.println("Enter the numbers");
		
		for(int i=0; i<count; i++) {
			
			
			
			int num = sc.nextInt();
			
			ls.add(num);
			
			
		}
		return ls;
		
	}
		
		public static void checkDuplicate(List<Integer> ls) throws Duplicate{
			
			Set<Integer> se = new HashSet();
			
			for(Integer ne:ls) {
				
				if(se.contains(ne)) {
					
				 throw new Duplicate("Duplicate values entered  " + ne);
				}
				
				se.add(ne);
				
			}
						
			
		}
		

	public static void main(String[] args) {
		
		
		try {
			
			List<Integer> num = listofnum();
			
			checkDuplicate(num);
			
			System.out.println("Only uniq numbers entered");
			
			
		}catch(Duplicate e) {
			
			System.out.println("Error: "+e.getMessage());
			
		}
		
	}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

//	
//	
//	public static List<Integer> listofnum() throws Duplicate {
//		
//		
//		List<Integer> num= new ArrayList();
//		
//		Scanner sc = new Scanner(System.in);
//		
//		
//		System.out.println("Enter Count of number");
//		
//		int count = sc.nextInt();
//		
//		
//		System.out.println("Enter the numbers");
//		
//		
//		
//		for(int i=0; i<count; i++) {
//
//			
//			
//			int nextInt = sc.nextInt();
//			
//			{
//				
//				num.add(nextInt);
//			}
//				
//				
//				
//			}
//		
//		
//		return num;
//			
//			
//			
//		}
//
//	public static void checkDuplicate(List<Integer> num) throws Duplicate {
//		
//
//		Set<Integer> uniq = new HashSet();
//		
//		for(Integer ne:num) {
//			
//			if(uniq.contains(ne)) {
//				
//							
//				throw new Duplicate("Duplicate values entered");
//			}
//			
//			uniq.add(ne);
//		}
//		
//		
//		
//	}
//	
//	public static void main(String[] args)  {
//		
//
//		try {
//			
//			
//			List<Integer> numbers = listofnum();
//			
//			checkDuplicate(numbers);
//			
//			System.out.println("Only Uniq Numbers entered");
//			
//		}
//		
//		catch(Duplicate r){
//			
//			System.out.println("Error: "+r.getMessage());
//			
//			
//		}
		
		
	}
	
















		
//	try {
//		
//		System.out.println("Enter Age");
//		
//		age();
//		
//		System.out.println("Candidate is major");
//		
//	}
//	
//	catch(UnderAge e){
//		
//		
//		System.out.println("Error: " +e.getMessage());
//		
//	}
//		
//		
//	}
//	
//	public static void age() throws UnderAge {
//
//    Scanner sc = new Scanner(System.in);
//    
//    Integer num = sc.nextInt();
//    
//    if(num<18) {
//    	
//    	throw new UnderAge("Candidate is Minor");
//    }
//		
//		
//	}
//		
//}	
//		
		
		
		
		
		
		
		
		

		
		
		
	

//		try{
//
//			readFile("F:\\NewFile2.txt");
//
//            System.out.println("File is empty");
//		}
//
//		catch(EmptyFile e){
//			
//			System.out.println("error: "+e.getMessage());
//
//			
//
//		}
//
//		
//
//	}
//
//
//	public static void readFile(String fileName) throws FileNotFoundException, EmptyFile {
//
//		File f = new File(fileName);
//
//		Scanner sc= new Scanner(f);
//
//		if(sc.hasNextLine()) {
//
//
//			
//
//				throw new EmptyFile("File is not Empty");
//			}
//
//
//		}
 
	
	
//	try{
//
//		readFile("F:\\NewFile2.txt");
//
//        System.out.println("File is empty");
//	}
//
//	catch(Positivenumber e){
//		
//		System.out.println("error: "+e.getMessage());
//
//		
//
//	}
//
//	
//
//}
//
//
//public static void readFile(String fileName) throws FileNotFoundException, Positivenumber {
//
//	File f = new File(fileName);
//
//	Scanner sc= new Scanner(f);
//
//	if(sc.hasNextLine()) {
//
//
//		
//
//			throw new Positivenumber(" is pasitive number");
//		}
//
//
//	}
		
		






