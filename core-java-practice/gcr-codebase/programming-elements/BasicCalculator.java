package level_2;
import java.util.Scanner;
public class BasicCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number:");
		float n1 = sc.nextFloat();
		System.out.print("Enter second number:");
		float n2 = sc.nextFloat();
		float add = n1+n2;
		float subtract = n1-n2;
		float product = n1*n2;
		float divide = n1/n2;
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + n1 + " and " + n2 + " is " + add + ", " + subtract + ", " + product + ", " + divide);
	}
}
