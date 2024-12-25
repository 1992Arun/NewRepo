package area.org;

import java.util.Scanner;

public class Exceptionss {
	
	
	private static void product() throws ProductNotFound {
		
		
		System.out.println("Enter product name");
		
		Scanner s = new Scanner(System.in);
		
		String product = s.next();
		
		if(product.equals("iphone")) {
			
			
			
			System.out.println("Product available");
			
		}
		
		else {
			
			throw new ProductNotFound();
		}
		
		
	}
		
		
	

	public static void main(String[] args) throws ProductNotFound {
		
		
		
		product();
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		
//		try {
//		
//			System.out.println(4/0);
//		
//		}
//		
//       catch(NullPointerException e ){
//			
//			System.out.println("Null");
//			
//		}
//		
//        catch(StringIndexOutOfBoundsException e ){
//			
//			System.out.println("String");
//			
//		}
//		
//        catch(IndexOutOfBoundsException e ){
//			
//			System.out.println("index");
//			
//		}
//		
//        catch(NumberFormatException e ){
//			
//			System.out.println("number");
//			
//		}
//		
//		catch(ArithmeticException e ){
//			
//			System.out.println("Arithmatic");
//			
//		}
//		
//        catch(Exception e ){
//			
//			System.out.println("All Handler");
//			
//		}
//		
//		
//			
//		System.out.println(5);
//		
		
	}

	
	
}
