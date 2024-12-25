package employee.org;

public class Programmer extends Employee{
	
	private double salary;
	private double overTime;
	
	
Programmer(String name, double salary, double overTime ){
	
	
	
	super(name, "programmer");
	 
	this.salary= salary;
	
	this.overTime= overTime;
	
}
	
double calculateSalary(){
	 
	
	
		return salary+overTime;
	}

public static void main(String[] args) {
	
	
	Programmer programmer = new Programmer("Arun", 45328.23, 2342.23);
	
	
	
	
	System.out.println("Name: "+programmer.getName()+"\nRole: "+programmer.getRole()+"\nSalary: "+programmer.calculateSalary());
	
	
	;
	
	
}
	
}
