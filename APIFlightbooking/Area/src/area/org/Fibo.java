package area.org;

public class Fibo {
	
	public static void main(String[] args) {
		
		
		int a=1;
		
		int b=1;
		
		int temp = 0;
		
		for(int i=1; i<11; i++) {
			
			 temp=a;
			 
			 a=a+b;
			 
			 b=temp;
			
			 System.out.println(b);	
		
		}
		
		
		
		
	}

}
