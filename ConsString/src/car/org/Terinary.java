package car.org;

public class Terinary {
	
	private int n1;
	private int n2;
	
	
	Terinary(int n1, int n2){
		
		this.n1=n1;
		
		this.n2=n2;
		
	}
	
Terinary(double n1, double n2){
		
		this.n1=(int)n1;
		
		this.n2=(int)n2;
		
	}
	

	public static void main(String[] args) {
		
		
		int n1= 10;
		
		int n2=20;
		
		
		
		int num = (n1<n2) ? (n1+n2): (n1-n2);
		
		
		System.out.println(num);
		
	}
	
}
