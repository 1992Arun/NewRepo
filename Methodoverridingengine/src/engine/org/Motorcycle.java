package engine.org;

public class Motorcycle extends Vehicle {
	
	
	
	public void startEngine() {
		
		System.out.println(" Bike Starts with kicker");
		
	}
	
	
	public void stopEngine(){
		
		System.out.println("Bike stops with key");
		
		
	}
	
	public static void main(String[] args) {
		
	
	Motorcycle m = new Motorcycle();
	
	m.startEngine();
	
	m.stopEngine();
	
	

}
}