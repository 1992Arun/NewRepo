package counter.org;

public class Customer extends BankAccount {
	
	public Customer(int accountNumber,int balance) {
		
		super(accountNumber,balance);
		
	}

	
	public static void main(String[] args) {
		
		
		Customer customer1 = new Customer(79329723, 2323);
		
		
		System.out.println("Account number: "+customer1.getAccountNumber());
		System.out.println("Account Balance: "+customer1.getBalance());
		System.out.println("Bank Name: "+customer1.getBankName());
		
		System.out.println("Intereset Rate: "+customer1.getInterestRate());
		
		
		
	
	}
}
