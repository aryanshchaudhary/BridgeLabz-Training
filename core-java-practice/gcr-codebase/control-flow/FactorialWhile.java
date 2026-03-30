package level_1;

import java.util.Scanner;

public class FactorialWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n = sc.nextInt();
		if (n<=0) {
			System.out.println("Please enter a positive integer");
			return;
		}
		int fact = 1;
		int i = 1;
		while  (i<=n) {
			fact *= i;
			i++;
		}
		System.out.println("The factorial is " + fact);
		sc.close();
	}
}
