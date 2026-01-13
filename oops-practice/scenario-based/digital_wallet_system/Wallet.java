package digital_wallet_system;

public class Wallet {
	private String ownerName;
	private double balance;

	public Wallet(String ownerName, double initialBalance) {
		this.ownerName = ownerName;
		this.balance = initialBalance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}
}
