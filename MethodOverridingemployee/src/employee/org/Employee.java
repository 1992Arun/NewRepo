package employee.org;

public class Employee {
	
	private String name;
	
	private String role;
	
	private double bonus;
	
	private double baseSalary;
	
	
	
	
	public Employee(String name, String role){
		
		this.name= name;
		
		this.role= role;
	}

	


	public String getName() {
		return name;
	}




	public String getRole() {
		return role;
	}


	


	double calculateSalary(){
		
		return 0.0;
	}

}
