package digital_wallet_system;

public class DigitalWalletSystem {
	public static void main(String[] args)  {
		try {
			DigitalWallet wallet = new DigitalWallet("101");
			wallet.deposit(500.0);
			System.out.println("Balance after adding funds: " + wallet.getBalance());
			wallet.withdraw(300.0);
			System.out.println("Balance after payment: " + wallet.getBalance());
			wallet.withdraw(1500.0);
		} catch (InsufficientBalanceException e) {
			System.out.println("Payment failed: " + e.getMessage());
		}
	}
}
