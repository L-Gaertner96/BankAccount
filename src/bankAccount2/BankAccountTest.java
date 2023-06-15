package bankAccount2;
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(1000.0, 2000.0);
		BankAccount account2 = new BankAccount(100.0, 300.0);
		
//		account1.deposit(500, "checking");
//		account2.deposit(1000, "Savings");
//		account1.deposit(100, "test");
		
//		account1.withdraw(100, "checking");
//		account2.withdraw(300, "savings");
//		account1.withdraw(1000, "savings");
		
		
		
		System.out.println("Account 1: Checking Balance = $"+account1.getCheckingBalance()+".\n Savings Balance = $"+account1.getSavingsBalance());
		System.out.println("Account 1 Total Assets: $"+account1.displayNetWorth());
		System.out.println("Account 2: Checking Balance = $"+account2.getCheckingBalance()+".\n Savings Balance = $"+account2.getSavingsBalance());
		System.out.println("Account 2 Total Assets: $"+account2.displayNetWorth());
		System.out.println("Number of total accounts: "+BankAccount.getNumberOfAccounts());
		System.out.println("Total Bank Assets = $"+BankAccount.getTotalAssets());
	}

}
