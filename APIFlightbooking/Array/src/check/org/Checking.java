package check.org;

import java.util.Arrays;

public class Checking {
	
	
	public boolean check(int arr[], int item) {
		
		for(int x:arr){
			
			if( x==item) {
				
				return true;
				
			}
			
		}
		return false;
		
		
	}
	
	
	public void checking(int arr[], int item) {
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]==item) {
				
				System.out.println(i);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Checking c = new Checking();
		
		int arr[] = {45,23,89,2,90};
		
	System.out.println(c.check(arr, 87));
	
	   c.checking(arr, 2);
	   
	   
	   int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	   
	   int removeIndex = 4;
	   
	   System.out.println(Arrays.toString(my_array));
	   
	   my_array[3]= my_array[4];
	   
	   System.out.println(Arrays.toString(my_array));
	   
	   
	   for(int i=removeIndex; i<my_array.length-1; i++) {
		   
		   
		   
		   my_array[i]= my_array[i+1];
		   
	   }
		
	   
	   System.out.println(Arrays.toString(my_array));
	   
	   
	   System.out.println("===========================");
	   
	   
	   int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	   
	   
	   System.out.println(Arrays.toString(array));
	   
	   int ar[] = new int [array.length];
	   
	   for(int i=0; i<array.length;i++) {
		   
		   
		   ar[i]= array[i];
		   
		   
	   }
	   
	   System.out.println("===========================");
		
	   System.out.println(Arrays.toString(ar));
	   
	   
	   System.out.println("===========================");
	   
	   
	   int[] b = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	   
	   int temp=0;
	   
	   System.out.println(Arrays.toString(b));
	   
	   for(int i=0; i<b.length;i++) {
		   
		   for(int j=i+1; j<b.length; j++) {
			   
			   if(b[i]>b[j]) {
				   
				   temp = b[i];
				   
				   b[i]=b[j];
				   
				   b[j]=temp;
				   
				   
			   }
			   
			   
		   }
		   
		   
	   }
	   System.out.println(Arrays.toString(b));
	   
	   
	   System.out.println(b[0]);
	   
	   System.out.println(b.length-1);
	   System.out.println(b[9]);
	   
	   
	   int[] d = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	   
	   
	   for(int i=d.length-1; i>=0; i--) {
		   
		   System.out.print(d[i]);
		   
		   System.out.println("=================================");
		   
		   String[] myarray = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
		   
		   
		 
			   
		   
		   
		   
	   }
	   
	   
	}

}
