package stroy_based_07_01_2026;
import java.util.*;
class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
interface BankService{
	void deposit(double amt);
	void withdraw(double amt) throws InsufficientBalanceException;
	double checkBalance();
}
class Account implements BankService{
	protected int accountNo;
	protected double balance;
	
	public Account(int accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
	public synchronized void deposit(double amt) {
		balance += amt;
		System.out.println("Deposited: " + amt);
	}
	public synchronized void withdraw(double amt) throws InsufficientBalanceException{
		if(balance<amt) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		balance -= amt;
		System.out.println("Withdrawn: " + amt);
	}
	public double checkBalance() {
		return balance;
	}
	public double calculateInterest() {
		return  0;
	}
}
class SavingsAccount extends Account{
	public SavingsAccount(int accNo, double bal) {
		super(accNo, bal);
	}
	
	@Override
	public double calculateInterest() {
		return balance * 0.04;
	}
}
class BankDatabase{
	private Map<Integer, Account> accounts = new HashMap<>();
	// Opening Account
	public void addAccount(Account acc) {
		accounts.put(acc.accountNo, acc);
		System.out.println("Account created");
	}
	
	// Getting Account Details
	public Account getAccount(int accNo) {
		return accounts.get(accNo);
	}
	
	// Deleting Account
	public void closeAccount(int accNo) {
		accounts.remove(accNo);
		System.out.println("Account closed");
	}	
}
class Transaction extends Thread{
	private Account account;
	
	public Transaction(Account account) {
		this.account = account;
	}
	
	public void run() {
		try {
			account.withdraw(500);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
public class OnlineBankingSystem {
	public static void main(String[] args) {
		BankDatabase db = new BankDatabase();
		Account acc = new SavingsAccount(101, 2000);
		db.addAccount(acc);
		System.out.println(acc.checkBalance());
		acc.deposit(1000);
		
		Transaction t1 = new Transaction(acc);
		Transaction t2 = new Transaction(acc);
		
		t1.start();
		t2.start();
		System.out.println("Interest: " + acc.calculateInterest());
		db.closeAccount(101);
	}
}
