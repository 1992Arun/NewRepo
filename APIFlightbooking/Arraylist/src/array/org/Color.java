package array.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Color {
	
	

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList();
		
		ls.add("Red");
		
		ls.add("Green");
		ls.add("Yellow");
		ls.add("White");
		ls.add("Orange");
		
		ls.add(2, "Black");
		
		List ls1= new ArrayList();
		
		ls1.addAll(ls);
		
		System.out.println("Copied arrylist: "+ls1);
		
		
		System.out.println(ls);
		
		
		ls.remove(2);
		
		Collections.sort(ls);
		
		
		System.out.println(ls);
		
		System.out.println("=============================");
		
		if(ls.contains("Blue")) {
			
			System.out.println("Element found");
		}
		
		else {
			
			System.out.println("Element not found");
		}
			
	System.out.println("=============================");
	
		for(String x: ls) {
			
			System.out.println(x);
			
		}
		
		for(int i=ls.size()-1; i>=0;i--) {
			
			System.out.println(ls.get(i));
			
			
		}
		
		
		List<String> sub= ls.subList(2, 4);
		
		System.out.println(sub);
		
		ls1.add("Blue");
		
		ls1.retainAll(ls);
		
		System.out.println(ls);
		
		System.out.println(ls1);
		
		
	
		Collections.swap(ls, 0, 3);
		
		
		System.out.println(ls);
		
	    
		
		System.out.println(ls1);
		
		
		List ls2= new ArrayList();
		
		ls2.add(ls);
		ls2.add(ls1);
		
		System.out.println(ls2);
		
		System.out.println(ls.isEmpty());
		
		
		ArrayList ar= new ArrayList(3);
		
		System.out.println(ar.size());
		
	ls2.add(2, "Purple");
	
	System.out.println(ls2);
	
	
	System.out.println("++++++++++++++++++");
	
	for(int i=0; i<ls2.size();i++)
		
		System.out.println(ls2.get(i));
		
	}
}
