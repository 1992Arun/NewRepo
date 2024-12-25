package arrayo.org;

import java.util.ArrayList;

public class College {
	
	

	public static void main(String[] args) {
		
	
  ArrayList<Course> courses= new ArrayList();
	
	Course c1 = new Course("Arun");
	Course c2= new Course("Java");
	Course c3 = new Course("milita");
	Course c4 = new Course("counter");
	
	courses.add(c1);
	courses.add(c2);
	courses.add(c3);
	courses.add(c4);
	
	
	c2.display();
	
	
		

	
	
	
	
	
	
	
	

}
}