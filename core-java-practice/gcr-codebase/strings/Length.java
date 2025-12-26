package level_2;
import java.util.Scanner;
public class Length {
	static int stringLength(String s1) {
		int length = 0;
		try {
			for(int i = 0; true; i++) {
				char ch = s1.charAt(i);
				length++;
			}
		} catch(Exception e) {
			System.out.println("Exception Held");
		}
		return length;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string");
		String text = sc.next();
		int l1 = stringLength(text);
		int l2= text.length();
		boolean equals = l1==l2;
		System.out.println("User Length : " + l1);
		System.out.println("System Length : " + l2);
		System.out.println("Final Comparision : " + equals);
	}
}
