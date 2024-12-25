package inher.org;

public class BankAccount {
	
	
	private double balance;
	
	private String accmountNumber;
	
	
	BankAccount(double balance, String accmountNumber ){
		
		
		this.balance=balance;
		
		
		this.accmountNumber=accmountNumber;
		
	}
	
	
	public void deposit( double amount) {
		
		
		
		balance+=amount;
		
		
		
	}
	
	
	
	
	public void withdraw(double amount ){
		
		{
			
			if (balance>=amount) {
				
				balance-=amount;
			}
			
			else {
				
				System.out.println("Insufficient balance");
				
				
			}
			
		}
		
	}
	
	public double getBalance() {
		
		return balance;
	}

}
