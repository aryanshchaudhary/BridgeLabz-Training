package digital_wallet_system;

public abstract class BankTransfer implements TransferService {
	private String bankAccountNumber;
	private String bankName;

	public BankTransfer(String bankAccountNumber, String bankName) {
		this.bankAccountNumber = bankAccountNumber;
		this.bankName = bankName;
	}

	public void pay(double amount) {
		System.out.println(
				"Processing bank transfer of Rs." + amount +
				" from account " + bankAccountNumber + " at " + bankName);
	}
	
}
