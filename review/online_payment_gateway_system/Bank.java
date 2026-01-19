package online_payment_gateway_system;

abstract class Bank implements Payment {
	protected String bankName;

	public Bank(String bankName) {
		this.bankName = bankName;
	}

	public String getBankName() {
		return bankName;
	}
	
}
