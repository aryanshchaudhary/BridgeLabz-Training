package flipkey;

import java.util.*;

public class FlipKey {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String input = sc.nextLine();
		System.out.println(cleanseAndInvert(input));
		sc.close();
	}

	public static boolean isValid(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')) {
				return false;
			}
		}
		return input.length() >= 6;
	}

	public static String cleanseAndInvert(String input) {
		if (!isValid(input)) {
			return "Invalid Input";
		}
		String lowerInput = input.toLowerCase();
		String oddASCII = "";
		for (int i = 0; i < lowerInput.length(); i++) {
			char ch = lowerInput.charAt(i);
			if (ch % 2 != 0) {
				oddASCII += ch;
			}
		}
		String revOddASCII = "";
		for (int i = oddASCII.length() - 1; i >= 0; i--) {
			revOddASCII += oddASCII.charAt(i);
		}
		String password = "";
		for (int i = 0; i < revOddASCII.length(); i++) {
			char ch = revOddASCII.charAt(i);
			if (i % 2 == 0) {
				ch = Character.toUpperCase(ch);
			}
			password += ch;
		}
		return "The generated key is - " + password;
	}
}
