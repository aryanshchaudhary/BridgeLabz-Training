package level_2;
import java.util.*;
public class PalindromeChecker {
	static boolean isPalindrome(String s) {
		s=s.toLowerCase().replaceAll("\\s+", "");
		int start = 0, end=s.length()-1;
		while(start<end) {
			if(s.charAt(start)!=s.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		if(isPalindrome(str))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		sc.close();
	}
}
