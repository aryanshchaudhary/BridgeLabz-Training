package level_3;
import java.util.*;
public class Palindrome {
	static boolean isPalindromeLogic1(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    static boolean isPalindromeLogic2(String text, int start, int end) {
        if (start >= end)
            return true;
        if (text.charAt(start) != text.charAt(end))
            return false;
        return isPalindromeLogic2(text, start + 1, end - 1);
    }
    static boolean isPalindromeLogic3(String text) {
        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];
        int idx = 0;

        for (int i = original.length - 1; i >= 0; i--) {
            reverse[idx++] = original[i];
        }

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i])
                return false;
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the message : ");
		String text = sc.nextLine();
		System.out.println("Logic 1 Result: " + isPalindromeLogic1(text));
        System.out.println("Logic 2 Result: " + 
            isPalindromeLogic2(text, 0, text.length() - 1));
        System.out.println("Logic 3 Result: " + isPalindromeLogic3(text));
		sc.close();
	}
}
