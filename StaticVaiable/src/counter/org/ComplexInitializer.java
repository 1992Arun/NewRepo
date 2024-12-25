package counter.org;

public class ComplexInitializer {
	
		static int x;
		
		static int y;
		
		static int z;

		
		static {
			
			x=10;
			y=34;
			
			z= calculate(x,y);
		}
		
		static int calculate(int x, int y) 
		
		{
		
			z= x*y;
			
			return z;
			
		}
	
	public static void main(String[] args) {
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(z);
		
	}

}
