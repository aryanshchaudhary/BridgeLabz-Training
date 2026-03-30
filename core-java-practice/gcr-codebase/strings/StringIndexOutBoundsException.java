package level_1;
import java.util.Scanner;
public class StringIndexOutBoundsException {
	static void generateException(String text) {
		System.out.println(text.charAt(10));
	}
	static void handleException(String text) {
		try {
			generateException(text);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception Handled");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Text:");
		String text = sc.next();
		handleException(text);	
	}
}
