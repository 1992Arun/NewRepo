package shape.org;

public class Rectangle {
	
	private double length;
	
	private double width;
	
public double calculateArea() {
		
		return length*width ;
		
		
	}


Rectangle(double length, double width){
	
	
	this.length = length;
	
	this.width= width;
	
}

public static void main(String[] args) {
	
	Rectangle rectangle = new Rectangle(45,77);
	
	System.out.println(rectangle.calculateArea());
	
}



}
