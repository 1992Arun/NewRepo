package labour.org;

public class Supervisor extends Employee {
	
	

	private double basic;
	
	private double overTime;
	
	public Supervisor(String name, double basic, double overTime) {
		
		super(name, "Supervisor");
		
		this.basic=basic;
		
		this.overTime=overTime;
		
	}
		
		public double calculateSalary() {
			 
			 return basic+overTime;
			 
		 }
		
				
		
	public static void main(String[] args) {
	
		
		
		Supervisor supervisor = new Supervisor("Josh",67212.22, 2328.43);
		
		
		System.out.println("Labour name: "+supervisor.getName()+"\nRole: "+supervisor.getRole()+"\nSalary "+supervisor.calculateSalary());
		
	}

	
	
}
