package array.org;

import java.util.ArrayList;

public class Arraylist {
	
	public static void main(String[] args) {
		

	
	ArrayList list = new ArrayList();
	
	
	list.add("Python");
    list.add("Java");
    list.add("PHP");
    list.add("C#");
    list.add("C++");
    list.add("Perl");
    
    
    String[] str =  new String[list.size()];
    
    
     list.toArray(str);
     
     for(String x: str) {
    	 
    	 System.out.println(x);
    	 
     }

}
}