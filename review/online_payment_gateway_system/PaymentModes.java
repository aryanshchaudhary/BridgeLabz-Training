package online_payment_gateway_system;

abstract class PaymentModes implements Payment {
	protected String paymentMode;
	
	public PaymentModes(String mode) {
		this.paymentMode = mode;
	}
	
	public String getPaymentMode(){
		return paymentMode;
	}
}
