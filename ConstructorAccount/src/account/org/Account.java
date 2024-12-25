package account.org;

public class Account {

	
	
	private String accountNumber;
	
	private int balance;
	
	public Account(String accountNumber, int balance ) {
		

     if(accountNumber == null || accountNumber.isEmpty() ) {
    	 
    	 System.out.println("Error: Account number cannot be null or empty.");
    	 
    	 return;
     }
		
     
     else if(balance<0) {
    	 
    	 System.out.println("Balance cannot be negative.");
    	 
    	 return;
    	 
     }
    	 
    	 this.accountNumber=accountNumber;
    	 
    	 this.balance= balance;
    	
    	
     }
     
     
     
	
	
	
	public static void main(String[] args) {
		
	
	Account account1 = new Account("26379239",  349);
	Account account2 = new Account("",  36732);
	Account account3 = new Account("8089127",  79912);
	
	
	
	
	
	
	}
	   
	}
	

