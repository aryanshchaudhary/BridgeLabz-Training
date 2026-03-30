package level_1;
import java.util.Scanner;
public class NumberFormatsException {
	static void generateException(String text) {
		int num = Integer.parseInt(text);
		System.out.println(text);
	}
	static void handleException(String text) {
		try {
			generateException(text);
		} catch(NumberFormatException e) {
			System.out.println("Exception Handled");
		} catch(RuntimeException e) {
			System.out.println("The exception is handled using generic runtime exception");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text:");
		String text = sc.next();
		handleException(text);
	}
}
