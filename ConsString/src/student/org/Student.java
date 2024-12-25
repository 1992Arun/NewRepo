package student.org;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private int student_id;
	
	private String student_name;

     private List grades; 
     
     
     public Student(int student_id, String student_name ) {
    	 
    	 this.student_id= student_id;
    	 
    	 this.student_name= student_name;
    	 
		
	}
     

     
public void addGrade(double grade) {
	 
	
	 if(grades == null) {
		 
		 
		 grades= new ArrayList();
		 
	 }
	 
	 grades.add(grade);
	
}     




   public int getStudent_id() {
	return student_id;
}



public String getStudent_name() {
	return student_name;
}



public List getGrades() {
	return grades;
}



public static void main(String[] args) {
	   
	   
	   Student s = new Student(7823, "Arun");
	   
	   s.addGrade(98.11);
	   s.addGrade(83.22);
	   
	   System.out.println(s.grades);
	   
	  
	   
}

}
