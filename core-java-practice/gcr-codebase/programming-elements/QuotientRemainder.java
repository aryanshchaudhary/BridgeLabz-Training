package level_2;
import java.util.Scanner;
public class QuotientRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number:");
		double n1=sc.nextDouble();
		System.out.print("Enter the second number:");
		double n2=sc.nextDouble();
		int quotient =  (int)n1/(int)n2;
		double reminder = n1%n2;
		System.out.println("The Quotient is " + quotient +
				" and Reminder is " + reminder +
				" of two number " + n1 + " and " + n2);
	}
}
