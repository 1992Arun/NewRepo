
public class Rectangle implements Drawable {
	
private double length;

private double width;

	public Rectangle(double length, double width ) {
		
		this.length= length;
		
		this.width= width;
		
		
	}
	
	
	@Override
	public void draw() {
	
		System.out.println("Drawing a Rectangle with length "+ length+"and width");
		
	}

}
