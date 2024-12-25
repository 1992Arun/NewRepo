package arraye.org;

public class ArrayEqual {
	
	
	public void arrayEqual(int[] array1, int[] array2) {
		
		boolean equalorNOt = true;
		
		for(int i=0; i<array1.length; i++ ) {
			
			
				
				
				if(array1[i]!=array2[i]) {
					
					equalorNOt =false;
					
				}
		}
		

//				else {
//					
//					equalorNOt =false;
//				}
//		
			

	
	
	   String string =(equalorNOt)? "Both arrays are equal": "Both arrays are not equal" ; 
	   
	   System.out.println(string);
	   
	}
//		
//		System.out.println("Both arrays are equal");
//		
//	}
//	else {
//		
//		System.out.println("Both arrays are not equal");
//	
//	}
//	}
	
	
	public static void main(String[] args) {
		
		
		ArrayEqual as = new ArrayEqual();
		
		int[] array1 = {2,1,4,5,6,7};
		
		
		int[] array2 = {2,3,4,5,6,7};
		
		as.arrayEqual(array1, array2);
		
		
	}

}
