package dog.org;

public class Main extends Dog {
	
	Main(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Main n = new Main("Max","Black");
		
		System.out.println(n.getColor()+" "+n.getName());
		
				
	}

}
