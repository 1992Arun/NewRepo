package method.org;

public class Car extends Vehicle {
	
	
public void speedUp(){
		
		super.speedUp();
		
		System.out.println("Car speeded up by 22 units speed Up");
		
		}


public static void main(String[] args) {
	
	
	Car car = new Car();
	
	System.out.println("Car speed before speed Up"+ car.getSpeed());
	
	car.speedUp();
	
	System.out.println("Car speed after speed Up  "+ car.getSpeed());
	
}

}
