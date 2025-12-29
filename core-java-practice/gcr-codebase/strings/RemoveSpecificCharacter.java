package string_extras;
import java.util.*;
public class RemoveSpecificCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = sc.nextLine();
		System.out.println("Enter the character to remove");
		char remove = sc.next().charAt(0);
		String result = "";
		for(int i =0; i<s.length(); i++) {
			if (s.charAt(i) != remove)
				result+=s.charAt(i);
		}
		System.out.println("Modified String: " + result);
		sc.close();
	}
}
