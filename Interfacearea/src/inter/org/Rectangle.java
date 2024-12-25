package inter.org;

public class Rectangle implements Shape {
	
	private int length;
	
	private int width;
	
	Rectangle(int length, int width){
		
		this.length=length;
		
		this.width= width;
	}
	
	
	public int getArea() {
		
		return length*width;
		
	}
	public static void main(String[] args) {
		
		
		


	
	Rectangle rectangle = new Rectangle(34,23);
	
	System.out.println(rectangle.getArea());
	
	
	}

}
