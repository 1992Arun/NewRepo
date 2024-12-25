package shape.org;

public class Circle {

	private double radious;
	
	
public double calculateArea() {
		
	
	
		return Math.PI*radious*radious ;
		
		
	}


public Circle(double radious) {
	
	this.radious= radious;
}

	
public static void main(String[] args) {
	
	Circle circle =  new Circle(4);
	
	  System.out.println(circle.calculateArea());
	  
	 
	
}

}
