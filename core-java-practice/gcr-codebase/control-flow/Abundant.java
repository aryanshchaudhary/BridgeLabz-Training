package level_3;
import java.util.*;
public class Abundant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num= sc.nextInt();

		int divisorSum = 0;

		for (int i = 1; i < num; i++) {
			if (num% i == 0) {
				divisorSum += i;
			}
		}
		if (divisorSum > num) {
			System.out.println("It's a Abundant Number.");
		} else
			System.out.println("It's not a Abundant Number.");

		sc.close();
	}
}
