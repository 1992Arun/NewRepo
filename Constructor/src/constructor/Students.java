package constructor;

public class Students {
	
	int studentId;
	
	String studentName;
	
	char grade;
	
	void Students(){
		
		
		
	}
	
	Students(int id, String name, char g){
		
		this.studentId=id;
		
		this.studentName=name;
		
		this.grade=g;


	}

	
	public void details(){
		
		System.out.println("Studend ID is: "+studentId);
		
		System.out.println("Studend Name is: "+studentName);
		
		System.out.println("Studend Grade is: "+grade);
	}
	
	
	public static void main(String[] args) {
		
		Students s = new Students(79329,"Arun",'G');
		
		s.details();
		
		
		
		
	}

}
