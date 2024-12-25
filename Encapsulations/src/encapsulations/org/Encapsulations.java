package encapsulations.org;

public class Encapsulations {
	
	public static void main(String[] args) {
		
		
		GetAge a = new GetAge();
		
		a.setAge(23);
		
		a.setGender('M');
		
		System.out.println(a.getAge());
		
		System.out.println(a.getGender());
		
	}

}
