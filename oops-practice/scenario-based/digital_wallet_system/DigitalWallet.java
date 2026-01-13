package digital_wallet_system;

public class DigitalWallet {
	private String walletId;
	private double balance;

	public DigitalWallet(String walletId) {
		this.walletId = walletId;
		this.balance = 0.0;
	}

	public String getWalletId() {
		return walletId;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public void withdraw(double amount) throws InsufficientBalanceException {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance for withdrawal");
		}
	}
}
