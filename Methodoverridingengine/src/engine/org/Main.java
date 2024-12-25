package engine.org;

public class Main {

	
	public static void main(String[] args) {
		
	
		
		
		Vehicle car = new Car();
		
		
		Vehicle motorcycle = new Motorcycle();
		
		
		StartAndStopEngine(car);
		StartAndStopEngine(motorcycle);
		
	}
		
		public static void StartAndStopEngine(Vehicle vehicle) {
			
			vehicle.startEngine();
			
			vehicle.stopEngine();
			
		}
		
	}
	

