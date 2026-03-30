package level_3;

import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int n1 = sc.nextInt();
		System.out.print("Enter the second number : ");
		int n2 = sc.nextInt();
		System.out.print("Select '+','-','*','/' : ");
		String op = sc.next();
		switch (op) {
		case "+":
			System.out.println(n1 + n2);
			break;
		case "-":
			System.out.println(n1 - n2);
			break;
		case "*":
			System.out.println(n1 * n2);
			break;
		case "/":
			System.out.println(n1 / n2);
			break;
		default:
			System.out.println("Invalid Operator");
		}
		sc.close();
	}
}
