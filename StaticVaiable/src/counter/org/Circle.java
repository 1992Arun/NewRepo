package counter.org;

public class Circle {
	
	public static final double PI = 3.14159;
	
     
	static double area(double radious ) {
		
		return PI*radious*radious;
	}

	
	public static void main(String[] args) {
		
		
		Circle c = new Circle();
		
	System.out.println(area(5.0));
		
		
		
	}
}
