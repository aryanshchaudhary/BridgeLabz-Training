package digital_wallet_system;

public class Transaction {
	private String transactionId;
	private double amount;
	private String date;
	private String type; // it will show whether amt is credited or debited

	public Transaction(String transactionId, double amount, String date, String type) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.date = date;
		this.type = type;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public String getDate() {
		return date;
	}

	public String getType() {
		return type;
	}
}
