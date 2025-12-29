package string_extras;
import java.util.*;
public class SubstringOccurence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String text = sc.nextLine();
		System.out.println("Enter the substring: ");
        String sub = sc.nextLine();
        int count = 0;

        for (int i = 0; i <= text.length() - sub.length(); i++) {
            if (text.substring(i, i + sub.length()).equals(sub))
                count++;
        }
        System.out.println("Occurrences: " + count);
		sc.close();
	}
}
