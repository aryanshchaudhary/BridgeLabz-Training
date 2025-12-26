package level_1;
import java.util.Scanner;
public class SumZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0.0;
		System.out.print("Enter the number: ");
		double n = sc.nextDouble();
		while(n!=0) {
			total += n;
			System.out.print("Enter the number: ");
			n = sc.nextDouble();
		}
		System.out.println("The total sum is: " + total);
	}
}


