package constructor;

public class SavingsAccount extends BankAccount {
	
	private int deposit;
	
		
	
	

	public SavingsAccount(int accountNumber, int balance) {
		
		super( accountNumber,  balance);
		
		
		
	}

	@Override
	public void deposit(int amount) {
		
		setBalance(getBalance()+amount);
	
		System.out.println("Deposited: "+amount);
		
	}

	@Override
	public void withdraw(int amount) {
		
		if(getBalance()-amount<=500) {
			
			System.out.println("insufficient balance");
		}
		
		else {
			
			setBalance(getBalance()-amount);
			
			System.out.println("Debited: "+amount);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		SavingsAccount s = new SavingsAccount(2739273, 3000);
		
		s.deposit(1000);
		
		System.out.println(s.getBalance());
		
		s.withdraw(500);
		
		System.out.println(s.getBalance());
		
		
	}
			
}

   
	
	
     