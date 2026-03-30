package level_1;
import java.util.*;
public class FactorialFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		if (n<=0) {
			System.out.println("Please enter a positive integer");
			return;
		}
		int fact = 1;
		for (int i=1; i<=n; i++) {
			fact *= i;
		}
		System.out.println("The factorial is " + fact);
		sc.close();
	}
}
