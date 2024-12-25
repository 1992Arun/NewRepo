package employee.org;

public class Manager extends Employee {
	
	private double salary;
	
	private double bonus;
	
	
	Manager(String name, double salary, double bonus){
		
		super(name, "Manager");
		 
		this.bonus= bonus;
		this.salary=salary;
	}
	
double calculateSalary(){
		
	
	return bonus+salary;
	
	}


	

public static void main(String[] args) {
	
	Manager manager = new Manager("Arun", 87444.34, 2323);
	

	
	System.out.println(manager.calculateSalary());
	
	System.out.println("Name: "+manager.getName()+"\nRole: "+manager.getRole()+"\nSalary: "+manager.calculateSalary());
	
	
}

}
