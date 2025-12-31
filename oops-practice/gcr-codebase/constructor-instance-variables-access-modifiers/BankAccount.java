package level_1;
public class BankAccount {
	public int accountNumber;
	protected String accountHolder;
	private double balance;
	public void setBalance(double b) {
		balance = b;
	}
	public double getBalance() {
		return balance;
	}
	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount();
		s.accountNumber = 101;
		s.accountHolder = "Amit";
		s.setBalance(5000);
		s.getaccountNumber();
		s.getaccountHolder();

		System.out.println("Account Balance: " + s.getBalance());
	}
}
class SavingsAccount extends BankAccount {
	public void getaccountNumber() {
	    System.out.println("Account Number: " + accountNumber);
	}
	public void getaccountHolder() {
	    System.out.println("Holder Name: " + accountHolder);
	}
}
