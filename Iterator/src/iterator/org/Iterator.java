package iterator.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iterator {
	
	
	
	public static void main(String[] args) {
		
		LinkedList<String> ls = new LinkedList();
		
		ls.add("one");
		
		ls.add("two");
		ls.add("Three");
		ls.add("Four");
		ls.add("Five");
		
		
		ListIterator p = ls.listIterator(1);
		
		while(p.hasNext()) {
			
			
			System.out.println(p.next());
		}
		
		
		System.out.println("==========================");
		
		System.out.println(ls.size());
		
		ls.add(5, "six");
		
		System.out.println(ls);
		
		
		for(int i=ls.size()-1; i>=0; i--) {
			
			System.out.println(ls.get(i)+"Index: "+i);
			
			
			
		}
		
		
		ls.addFirst("zero");
		
		ls.addLast("seven");
		
		System.out.println(ls);
		
		
		
	LinkedList ls2= new LinkedList();
	
	ls2.add("nine");
	
	ls2.add("ten");
		
		
		ls.addAll(2, ls2);
		
		System.out.println(ls);
		
		
		Object first = ls.getFirst(); 
		
		
		
		System.out.println(ls);
		
		
		ArrayList ar= new ArrayList(ls);
		
		
		ls.remove(2);
		
		System.out.println(ls);
		
		System.out.println("===========Swap=======");
		
		Collections.swap(ls, 2, 3);
		
		
		System.out.println(ls);
		
		
		LinkedList l3= new LinkedList();
		
		l3.addAll(ls);
		
		System.out.println(l3);
		
		l3.pop();
		
		
		System.out.println(l3);
		
		System.out.println(l3.peek());
		
		if(ls.contains("eleven")) {
			
			System.out.println("element found");
		}
		
		else {
			
			System.out.println("element not found");
		}
		
		
		int a = 10;
		
		
		
		System.out.println("list 1"+ls);
		
		System.out.println("list 2"+ls2);
		
		//ls.retainAll(ls2);
		
		System.out.println(ls);
		
		System.out.println(ls.isEmpty());
		
		ls.set(5, "eleven");
		
		System.out.println(ls);
		
		
	}
	
	

}
