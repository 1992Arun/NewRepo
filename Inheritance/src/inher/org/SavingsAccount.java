package inher.org;

public class SavingsAccount extends BankAccount{
	
	

	


SavingsAccount(double balance, String accmountNumber) {
		
	super(balance, accmountNumber);
		
		
	}




public void withdraw(double amount ){
	  
	if(getBalance()-amount<100) {
		
		System.out.println("Insufficient balance");
	}
	
	else {
		
		super.withdraw(amount);
	}
	  
	
		
		
	}


public static void main(String[] args) {
	
	BankAccount s = new BankAccount(50000, "232424121");
	
	s.withdraw(100);
	
	System.out.println(s.getBalance());
	
	s.deposit(345);
	
	System.out.println(s.getBalance());
	
	
}
	
}
