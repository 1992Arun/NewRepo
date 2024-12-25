package encap.org;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Students  {
	
	public static void main(String[] args) {
		
	
	
		Encapsulation s = new Encapsulation();
		
		s.setName("Arun");
		
		s.setPhoneNumber(97238723326l);
		
		s.setRollNumber(653729);
	 
		   s.getName();
		   s.getPhoneNumber();
		   s.getRollNumber();
		   
		  // System.out.println(s.getName());
		   
		   
		   Encapsulation s1 = new Encapsulation();
		   
			s1.setName("Kevin");
			
			s1.setPhoneNumber(9782124262l);
			
			s1.setRollNumber(542719);
		  

			List<Encapsulation> l = new LinkedList();
			
			l.add(s);
			l.add(s1);
			
		//	   System.out.println(l.get(1).getName());
			   
			   
			 for(int i=0; i<l.size();i++) {
				 
				 
				 
				 System.out.println(l.get(i).getName());
				 
			 }
			 
			 System.out.println("===========Enhanced For Loop=========");
			 
			 for(Encapsulation x:l) {
				 
				 System.out.println(x.getName());
				 
			 }
			
			 
			 System.out.println("=================SetMetho===============");
			 
			 
			 Set<Encapsulation> se = new LinkedHashSet();
			 
			 se.add(s);
			 se.add(s1);
			 
			 
			 for(Encapsulation x:se) {
				 
				 System.out.println(x.getPhoneNumber());
				 
			 }
			 
			 
			 System.out.println("===========Map===========");
			
			 Map <Integer, Encapsulation > mp = new HashMap();
			 
			 
			 mp.put(10, s);
			 
			 mp.put(20, s1);
			 
			 Set<Entry<Integer, Encapsulation>> entrySet = mp.entrySet();
			 
			 for(Entry<Integer, Encapsulation> x: entrySet) {
				 
				System.out.println(x.getValue().getRollNumber());
			 }
			 
			 
			 
			
}
}