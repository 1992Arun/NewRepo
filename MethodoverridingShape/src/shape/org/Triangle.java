package shape.org;

public class Triangle {
	
	private double height;
	
	private double length;

public double calculateArea() {
		
		return 0.5*height*length ;
		
		
	}

   public Triangle(double height, double length) {
	   
	   this.height= height;
	   this.length= length;
	   
   }
   
  
public static void main(String[] args) {
	
	
	Triangle triangle = new Triangle(4,6);
	
	System.out.println(triangle.calculateArea());
	
}

}
