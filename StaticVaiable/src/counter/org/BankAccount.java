package counter.org;

public class BankAccount {
	
	private int accountNumber;
	
	private int  balance;
	
	static String bankName = "Axis";
	
	static double interestRate = 7.2;
	
	
	public BankAccount(int accountNumber, int balance) {
		
		this.accountNumber =accountNumber;
		this.balance =balance;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public static void setBankName(String bankName) {
		BankAccount.bankName = bankName;
	}

	public static void setInterestRate(double interestRate) {
		BankAccount.interestRate = interestRate;
	}

	
	
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public static String getBankName() {
		return bankName;
	}

	public static double getInterestRate() {
		return interestRate;
	}
	
	
	
	
	

}
