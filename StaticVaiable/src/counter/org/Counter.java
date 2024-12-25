package counter.org;

public class Counter {
	
	static int counter;
	
	public Counter() {
		
		counter++;
		
	}
	
	public static void main(String[] args) {
		
		
		Counter c1= new Counter();
		Counter c2= new Counter();
		Counter c3= new Counter();
		
		System.out.println(counter);
		 
	}

}
