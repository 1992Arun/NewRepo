package sort.org;

import java.util.Arrays;

public class Sorting {
	
	public static void main(String[] args) {
		
	
     int a[] = {12,56,34,67,3,99,56};
     
     String b[] = {"Java","Php", "C","C++","python"};
     
    System.out.println(Arrays.toString(a));
     
    Arrays.sort(a);

    System.out.println(Arrays.toString(a));
    
    
	System.out.println(Arrays.toString(b));
	
	Arrays.sort(b);
	
	System.out.println(Arrays.toString(b));
	
	
	for(int i=0; i<a.length;i++) {
		
		
		
	}
	
	
	
	int temp =0;
	
	for(int i=0; i<a.length;i++) {
		
		temp += a[i];
		
		
		
	}
	
	System.out.println(temp);
	
	System.out.println("=========================================");
	
for(int i=0; i<a.length;i++) {
	
	if(a[i]==3) {
		
		System.out.println("It is there");
		
		
	}
	

		
	
	

}


	
	
	System.out.println("=========================================");
	
	int [][] c = new int [10][10];
	
	for(int i=0; i<c.length; i++) {
		
		for(int j=0; j<c.length;j++) {
			
			System.out.printf("%3d",c[i][j]);
			
			
		}
		
		System.out.println();
	}
	
}
	

}
