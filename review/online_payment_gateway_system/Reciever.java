package online_payment_gateway_system;

abstract class Reciever implements Payment {
	protected String recieverName;
	protected String recieverAccount;

	public Reciever(String recieverName, String recieverAccount) {
		this.recieverName = recieverName;
		this.recieverAccount = recieverAccount;
	}

	public String getRecieverName() {
		return recieverName;
	}

	public String getRecieverAccount() {
		return recieverAccount;
	}
}
