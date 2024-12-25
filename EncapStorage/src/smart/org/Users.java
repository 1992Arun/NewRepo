package smart.org;

public class Users {

	
	public static void main(String[] args) {
		
	

	SmartPhone s = new SmartPhone();
	
	s.setBrand("OnePlus");
	s.setModel("Nord");
	
	s.setStorageCapacity(252);
	
	System.out.println(s.getStorageCapacity());
	
	
	System.out.println(s.increaseStorage(32));
	

	
	
}
	
}
