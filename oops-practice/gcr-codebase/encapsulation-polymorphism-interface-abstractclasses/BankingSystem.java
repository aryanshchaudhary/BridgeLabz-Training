package encapsulation_polymorphism;
import java.util.*;
interface Loanable{
	void applyForLoan();
	double calculateLoanEligibility();
}
abstract class BankAccount{
	private int accountNumber;
	private String holderName;
	protected double balance;
	
	public BankAccount(int accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		if(amount <= balance)
			balance -= amount;
	}
	public abstract double calculateInterest();
}
class SavingsAccount extends BankAccount implements Loanable{
	public SavingsAccount(int accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}
	public double calculateInterest() {
		return balance*0.04;
	}
	public void applyForLoan() {
		System.out.println("Loan Applied");
	}
	public double calculateLoanEligibility() {
		return balance*5;
	}
}
public class BankingSystem {
	public static void main(String[] args) {
		BankAccount acc = new SavingsAccount(123, "Aryan", 100000);
        System.out.println("Interest: " + acc.calculateInterest());
	}
}
