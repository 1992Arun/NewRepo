package method.org;

public class Motorcycle extends Vehicle{
	
	
	public void speedUp(){
		
		super.speedUp();
		
		System.out.println("Motorcycle speed increased by 12 units");
		
		}
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
		Motorcycle s =  new Motorcycle();
		
		System.out.println(s.getSpeed());
		
		s.speedUp();
		
		System.out.println("Motorcycle speed after speed up "+s.getSpeed()); 
		
	}

}
