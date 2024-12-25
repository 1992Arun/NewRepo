package bankinfo.org;

public class User {
	
	
	public static void main(String[] args) {
		
		
		BankAccount b =  new BankAccount();
		
		b.setAccountNumber(749127492);
		
		b.setBalance(17222.24f);
		
		System.out.println(b.getBalance());
		
	}

}
