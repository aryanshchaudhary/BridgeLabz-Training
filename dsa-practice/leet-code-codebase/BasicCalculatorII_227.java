package week_3;

import java.util.*;

public class BasicCalculatorII_227 {
	public static int calculate(String s) {
		Stack<Integer> stack = new Stack<>();
		int num = 0;
		char sign = '+';

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isDigit(ch)) {
				num = num * 10 + (ch - '0');
			}

			if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {
				if (sign == '+') {
					stack.push(num);
				} else if (sign == '-') {
					stack.push(-num);
				} else if (sign == '*') {
					stack.push(stack.pop() * num);
				} else if (sign == '/') {
					stack.push(stack.pop() / num);
				}
				sign = ch;
				num = 0;
			}
		}
		int result = 0;
		for (int val : stack) {
			result += val;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value : ");
		String s = sc.next();
		int result =  calculate(s);
		System.out.println(result);
		sc.close();
	}
}
