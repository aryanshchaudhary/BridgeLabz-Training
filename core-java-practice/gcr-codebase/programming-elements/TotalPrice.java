package level_1;
import java.util.Scanner;
public class TotalPrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the unit price");
		double uPrice = sc.nextDouble();
		System.out.print("Enter the quantity");
		double qnty = sc.nextDouble();
		double totalPrice = uPrice*qnty;
		System.out.println("The total purchase price is INR " 
		+ totalPrice + " if the quantity is "
				+ qnty + " and unit price is INR " + uPrice );
	}
}
