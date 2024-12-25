package point.org;

public class Point {
	
	private int x,y;
	
	public Point(int x, int y) {
		
		this.x=x;
		
		this.y=y;
	}
	
public Point(double x, double y) {
		
		this.x= (int) x;
		
		this.y=(int) y;
	}


  public void point() {
	  
	  System.out.println(x+" , "+y );
  }
  
  public static void main(String[] args) {
	
	  Point p = new Point(34.34,75.45);
	  
	  p.point();
	  
}

}
