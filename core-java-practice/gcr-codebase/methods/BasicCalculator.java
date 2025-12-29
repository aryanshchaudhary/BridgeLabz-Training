package level_2;
import java.util.*;
public class BasicCalculator {
	static double add(double a, double b) {
		return (a+b);
	}
	static double subtract(double a, double b) {
		return (a-b);
	}
	static double product(double a, double b) {
		return (a*b);
	}
	static double divide(double a, double b) {
		return (a/b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a = sc.nextInt();
		System.out.print("Enter the second number : ");
		int b = sc.nextInt();
		System.out.println("Select the operation '+','-','*' or '/' : ");
		char op = sc.next().charAt(0);
		switch(op) {
		case '+': System.out.println("Result = " + add(a, b)); break;
        case '-': System.out.println("Result = " + subtract(a, b)); break;
        case '*': System.out.println("Result = " + product(a, b)); break;
        case '/': System.out.println("Result = " + divide(a, b)); break;
        default: System.out.println("Invalid choice");
		}
		sc.close();
	}
}
