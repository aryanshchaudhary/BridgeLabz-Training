package scenario_based;
import java.util.*;
public class CoffeeCounterChronicles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\nEnter coffee type (espresso/latte/cappuccino) or type 'exit' to stop:");
			String coffeeType = sc.next().toLowerCase();
			if (coffeeType.equals("exit")) {
				System.out.println("Visit Again. Thank you!");
				break;
			}
			double price = 0;

			// Select Coffee Type and their price are displayed
			switch (coffeeType) {
			case "espresso":
				price = 120;
				break;
			case "latte":
				price = 150;
				break;
			case "cappuccino":
				price = 180;
				break;
			default:
				System.out.println("Invalid coffee type!");
				continue; // the order will be skipped
			}

			System.out.print("Enter quantity: ");
			int quantity = sc.nextInt();

			double total = price * quantity;
			double gst = total * 0.05; // to add gst of 5%
			double finalBill = total + gst;

			System.out.println("Total Bill (including GST): ₹" + finalBill);
		}

		sc.close();
	}
}
