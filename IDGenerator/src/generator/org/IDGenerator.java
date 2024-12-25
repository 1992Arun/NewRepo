package generator.org;

public class IDGenerator {
	
	static int nextID;
	
	
	public static int generateID(){
		
		return nextID++;
		
	}
	
	public static void main(String[] args) {
		
	
		
		System.out.println(generateID());
		System.out.println(generateID());
		System.out.println(generateID());
	}

}
