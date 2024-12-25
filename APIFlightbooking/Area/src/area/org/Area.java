package area.org;

public class Area {
	
	private int length;
	
	private int breath;
	
	 Area(int length, int breath ){
		
		 this.length= length;
		 
		 this.breath= breath;
		 
		
	}
	 
	 void rectangleArea(){
		 
		 int area= length*breath;
		 
		System.out.println(area);
		 
	 }

}
