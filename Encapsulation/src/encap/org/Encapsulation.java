package encap.org;

public class Encapsulation {
	
	private String name;
	
	private int rollNumber;
	
	private long phoneNumber;

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
		
		
	}

	public String getName() {
		return name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	

}
