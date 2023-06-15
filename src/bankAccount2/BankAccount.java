package bankAccount2;


public class BankAccount {
	private double checkingBalance;
	private double savingsBalance;
	private static int numberOfAccounts = 0;
	private static double totalAssets = 0.0;
	
	public BankAccount(double checkingBalance, double savingsBalance) {
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		numberOfAccounts++;
		totalAssets += checkingBalance+savingsBalance;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public void setCheckingBalance(double checkingBalance) {
		totalAssets -= this.checkingBalance;
		this.checkingBalance = checkingBalance;
		totalAssets += checkingBalance;
	}
	
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	public void setSavingsBalance(double savingsBalance) {
		totalAssets -= this.savingsBalance;
		this.savingsBalance = savingsBalance;
		totalAssets += this.savingsBalance;
	}
	
	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	
	public static double getTotalAssets() {
		return totalAssets;
	}
	
	public void deposit(double amount, String accountType) {
		switch (accountType.toLowerCase()) {
			case "checking":
				checkingBalance+=amount;
				totalAssets+= amount;
				break;
			case "savings":
				savingsBalance+=amount;
				totalAssets+=amount;
				break;
			default:
				System.out.println("Invalid account type, please inidcate either \"checking\" or \"savings\" for your deposit");
		}
	}
	
	public void withdraw(double amount, String accountType) {
		if (accountType.equalsIgnoreCase("checking")) {
			if(amount<=checkingBalance) {
				checkingBalance-=amount;
				totalAssets-=amount;
			}
			else {
				System.out.println("Insufficient funds for withdrawal");
			}
		}
		else if(accountType.equalsIgnoreCase("savings")) {
			if(amount<=savingsBalance) {
				savingsBalance-=amount;
				totalAssets-=amount;
			}
			else {
				System.out.println("Insufficient funds for withdrawal");
			}
		}
		else {
			System.out.println("Please select a valid account type to withdraw from");
		}
	}
	
	public double displayNetWorth() {
		return checkingBalance+savingsBalance;
	}
}
