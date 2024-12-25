package variables.org;

public class ChildClass extends Variables {
	
	int a=10;
			
			private void name() {
				
				System.out.println(++a);

			}
	
	public static void main(String[] args) {
		
	
		
		ChildClass ba= new ChildClass();
		
		ba.name();
		
		ba.name();
		
	}

}
