package practice_problem;
import java.util.Scanner;
public class AddTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number:");
		int a = sc.nextInt();
		System.out.print("Enter second number:");
		int b = sc.nextInt();
		int Sum = a + b;
		System.out.println("The sum of two numbers=" + Sum);

	}

}
