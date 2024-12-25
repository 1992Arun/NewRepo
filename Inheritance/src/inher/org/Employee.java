package inher.org;

public class Employee extends Person {

	 private int employeeId ;
	 
	 private String jobTitle;
	
	
	 Employee(String firstName, String lastName, String jobTitle, int employeeId ){
		 
		 super(firstName, lastName);
		 
		 this.jobTitle=jobTitle;
		 
		 this.employeeId=employeeId;	 
	 }
	 
	 public int  getEmployeeId() {
		
		
		return employeeId;		
	}
	
	String getLastName() {
		
		
		return super.getLastName();		
		
	}
	
	public static void main(String[] args) {
				
		Employee employee = new Employee("Arun","kumar","accounts",2323);		
		
		System.out.println(employee.getFirstName()+employee.employeeId+employee.jobTitle+employee.getLastName());
				
	}
	
}
