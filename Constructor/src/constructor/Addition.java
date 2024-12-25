package constructor;

import java.util.ArrayList;
import java.util.List;

public class Addition {
	
	

	public static void main(String[] args) {
		
		List<Integer> li= new ArrayList();
		
		int[] arr = {45,23,12,56,87,31,90,10,2,93,74};
		
		
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]<50) {
				
				li.add(arr[i]);
				
				
				
			}
			
		}
		
		
		for(int x:li) {
			
			System.out.println(x);
			
		}
		
	}
}
