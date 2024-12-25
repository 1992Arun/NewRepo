package sort.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicate {
	
	public static void main(String[] args) {
		
		
		 String[] myarray = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
		
		
		 for(int i=0; i<myarray.length-1;i++) {
			   
			   for(int j=i+1; j<myarray.length; j++) {
				   
				   if(myarray[i]==myarray[j]) {
					   
					   System.out.println("Duplicate value:"+myarray[i]);
					   
				   }
				   
			   }
			   
			   
		   }
		
		 
		 List ar = new ArrayList(Arrays.asList(myarray));
		 
		 System.out.println(ar);
		 
		
	}

}
