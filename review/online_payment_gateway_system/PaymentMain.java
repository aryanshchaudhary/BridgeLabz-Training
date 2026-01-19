package online_payment_gateway_system;
import java.util.*;
public class PaymentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter User Details:");
		System.out.print("User Name: ");
		String userName = sc.nextLine();
		System.out.print("User Email: ");
		String userEmail = sc.nextLine();
		System.out.print("Item: ");
		String item = sc.nextLine();
		User user = new User(userName, userEmail, item) {
			@Override
			public boolean processPayment(double amount) {
				System.out.println("Transferring amount of Rs." + amount + " for " + item);
				return true;
			}
		};

		System.out.println("\nEnter Receiver Details:");
		System.out.print("Receiver Name: ");
		String receiverName = sc.nextLine();
		System.out.print("Receiver's Account: ");
		String receiverAccount = sc.nextLine();
		Reciever receiver = new Reciever(receiverName, receiverAccount) {
			@Override
			public boolean processPayment(double amount) {
				System.out.println("Receiving payment of Rs." + amount );
				return true;
			}
		};
		
		System.out.println("\nEnter the payment mode (Credit Card, UPI, Wallet, Net Banking) :");
		System.out.println("Mode Name: ");	
		String paymentMode = sc.nextLine();
		PaymentModes payM = new PaymentModes(paymentMode) {
			@Override
			public boolean processPayment(double amount) {
				System.out.println("Processing payment of Rs." + amount + " via " + paymentMode);
				return true;
			}
		};

		System.out.println("\nEnter Bank Details:");
		System.out.print("Bank Name: ");
		String bankName = sc.nextLine();
		Bank bank = new Bank(bankName) {
			@Override
			public boolean processPayment(double amount) {
				System.out.println("Processing payment of Rs." + amount + " through " + bankName);
				return true;
			}
		};
		
		System.out.print("\nEnter Payment Amount: Rs.");
		double amount = sc.nextDouble();
		
		System.out.println("\nPayment Processing");
		if(amount <= 0) {
			System.out.println("Please enter valid amount.");
		}else if(user.processPayment(amount) && payM.processPayment(amount) && bank.processPayment(amount) && receiver.processPayment(amount)) {
			System.out.println("Payment of Rs." + amount + " completed successfully.");
		} else {
			System.out.println("Payment failed.");
		}
		sc.close();
	}
}
