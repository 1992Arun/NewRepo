package cons.org;

public class ConstructorArray {
	
	
	private String className;
	
	private String[] students;
	
	
	ConstructorArray(String className, String[] students ){
		
		
		this.className=className;
		
		this.students =students;
		
		
	}
	
	public void classRoom() {
		
		System.out.println("ClassName: "+className);
		
		System.out.println("Studends: ");
		
		for(String Student:students) {
			
			System.out.println(Student);
		}
	}
	
	public static void main(String[] args) {
		
		
		String[] arr= {"Arun","Megan","Kevin"};
		
		
		ConstructorArray c = new ConstructorArray("Science 101", arr  );
		
		c.classRoom();
		
		
	}
}
