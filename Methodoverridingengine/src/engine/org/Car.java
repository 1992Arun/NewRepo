package engine.org;

public class Car extends Vehicle {
	
   
	
	public void startEngine() {
			
		System.out.println(" Car Started with button");
		
	}
	
	
	public void stopEngine(){
		
		System.out.println(" Car stoped car with key");
		
		
	}
	
	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.startEngine();
		c.stopEngine();
	}
	

}
