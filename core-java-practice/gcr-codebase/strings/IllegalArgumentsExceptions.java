package level_1;
import java.util.Scanner;
public class IllegalArgumentsExceptions {
	static void generateException(String text) {
		System.out.println(text.substring(5,10));
	}
	static void handleException(String text) {
		try {
			generateException(text);
		} catch(IllegalArgumentException e){
			System.out.println("Exception Handled");
		} catch(RuntimeException e) {
			System.out.println("Exception Handled using Generic runtime exception");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Text:");
		String text = sc.next();
		handleException(text);		
	}
}
