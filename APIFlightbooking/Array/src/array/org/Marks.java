package array.org;

public class Marks extends Array {
	
	
	
	public static void main(String[] args) {
		
		Marks s1 = new Marks();
		
		s1.name= "Arun";
		
		s1.rollNumebr= 656281;
		
		s1.marks= 90;
		 
      Marks s2 = new Marks();
		
		s2.name= "Srarn";
		
		s2.rollNumebr= 380238;
		
		s2.marks= 50;
		 
		
		
      Marks s3 = new Marks();
      
    
		s3.name= "Navin";
		
		s3.rollNumebr= 783192;
		
		s3.marks= 78;
		 
		Marks students[] = new Marks[3];
		
		students[0]= s1;
		
		students[1]= s2;
		
		students[2]= s3;
		
		
		for(int i = 0; i<students.length;i++) {
			
			
		
		System.out.println(students[i].name+":"+students[i].marks);
		
		}
	}

}
