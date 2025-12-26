

package level_1;
import java.util.Scanner;
public class LowerCase {
	static String lowerCase(String text) {
		String result="";
		for(int i = 0; i<text.length(); i++) {
			char ch = text.charAt(i);
			if(ch>='A' && ch<='Z')
				result += (char)(ch - 'A' + 'a');
			else
				result += ch;
		}
		return result;
	}
	static boolean compareString(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		for (int i = 0; i<s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string");
		String text = sc.nextLine();
		String s1 = lowerCase(text);
		String s2 = text.toLowerCase();
		boolean equals = compareString(s1, s2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Final Comparison=" + equals);
		
	}

}
