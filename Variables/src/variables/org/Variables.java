package variables.org;

public class Variables {
	
	  int a=144;
	
	private void empId() {
		
		
		
		System.out.println(a);

	}
	
	public static void main(String[] args) {
		
		Variables d = new Variables();
		
		d.empId();
		
		System.out.println(d.a);
		
		 d.a=234;
		
		System.out.println(d.a);
		
		
		
		System.out.println(d.a);
	}

}
