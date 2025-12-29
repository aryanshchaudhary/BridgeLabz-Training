package scenario_based;
import java.util.*;
public class MovieTicketBookingApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the type of movie (2D/3D or exit): ");
			String mType=sc.next();
			if (mType == "exit") {
				break;
			}
			System.out.println("Enter seat type (gold/silver): ");
			String sType=sc.next();
			System.out.println("Do you want snacks? (Yes/No): ");
			String snacks=sc.next();
			int price=0;
			// Movie Pricing
			switch (mType.toLowerCase()) {
			case "2d":
				price = 150;
				break;
			case "3d":
				price = 200;
				break;
			default:
				System.out.println("Invalid Movie Type!");
				continue;
			}
			// Seat pricing
			if (sType.equalsIgnoreCase("gold")) {
				price+=100;
			}else if (sType.equalsIgnoreCase("silver")) {
				price+=50;
			}else {
				System.out.println("Invalid Seat Type");
				continue;
			}
			if(snacks.equalsIgnoreCase("yes")) {
				price+=80;
			}
			System.out.println("Total Ticket Price: Rs" + price);
		}
		sc.close();
	}
}
