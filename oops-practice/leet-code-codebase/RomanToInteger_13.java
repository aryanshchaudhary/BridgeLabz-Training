package l_2;

import java.util.*;

public class RomanToInteger_13 {
	public static int getVal(char ch) {
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roman number: ");
		String str = sc.next();
		int n = str.length();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			char ch1 = str.charAt(i);
			if ((i + 1) < n && getVal(ch1) < getVal(str.charAt(i + 1)))
				sum = sum - getVal(ch1);
			else
				sum = sum + getVal(ch1);
		}
		System.out.println(sum);
		sc.close();
	}
}
