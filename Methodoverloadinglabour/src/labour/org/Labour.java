package labour.org;

public class Labour extends Employee {
	
	
	private double wage;
	
	private double overTime;
	
	Labour(String name, String role, double wage, double overTime){
		
		super(name, role );
		
	   this.wage=wage;
	   
	   this.overTime=overTime;
	   
		
		
	}
	
	
	 public double calculateSalary() {
		 
		 return wage+overTime;
		 
	 }
	
	
	public static void main(String[] args) {
		
		
		Labour labour = new Labour("Arun", "sdf", 2792, 234);
		
		System.out.println("Labour name: "+labour.getName()+"\nRole: "+labour.getRole()+"\nSalary "+labour.calculateSalary());
		
	}

}
