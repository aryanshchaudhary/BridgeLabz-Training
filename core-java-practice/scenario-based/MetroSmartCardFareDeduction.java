package scenario_based;
import java.util.*;
public class MetroSmartCardFareDeduction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double balance = 200; // initial balance
		while (balance > 0) {
			System.out.println("Current Balance: Rs. " + balance);
			System.out.println("Enter the distance in km ( or 0 to exit): ");
			double distance = sc.nextDouble();
			if (distance == 0) {
				System.out.println("Thank You and Visit Again");
				break;
			}
			int fare = (distance <= 5) ? 20 : (distance <= 10) ? 40 : (distance <= 20) ? 40 : 50;
			if (balance >= fare) {
				balance = balance - fare;
				System.out.println("Fare is deducted; Rs. " + fare);
			} else {
				System.out.println("Insufficient Balance");
				break;
			}
		}
		sc.close();
	}
}
