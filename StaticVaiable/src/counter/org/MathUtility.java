package counter.org;

public class MathUtility {
	
	static int sum;
	
	static int add(int a, int b){
		
		sum =a+b;
		
		return sum;
		
		
	}
	
	public static void main(String[] args) {
		
		MathUtility.add(34, 75);
		
		System.out.println(sum);
	
		
	}

}
