package level_1;
import java.util.Scanner;
public class SumZeroNegative {
	public static void main(String[] args) {
		double total = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		double n = sc.nextDouble();
		while (true) {	
			if (n<=0)
				break;
			total += n;
			System.out.print("Enter the number: ");
			n = sc.nextDouble();
		}
		System.out.println("The total sum is: " + total);
	}
}
