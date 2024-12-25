package constructor;

public abstract class BankAccount  {
	
	private int accountNumber;
	
	private int balance;
	
	
	public BankAccount(int accountNumber, int balance) {
		
		this.accountNumber= accountNumber;
		
		this.balance= balance;
	}
	
	


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	


	public int getAccountNumber() {
		return accountNumber;
	}


	public int getBalance() {
		return balance;
	}




	public abstract  void deposit(int amount);
	
	public abstract void withdraw(int amount);
}