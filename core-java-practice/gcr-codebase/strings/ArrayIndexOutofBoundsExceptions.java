package level_1;
import java.util.Scanner;
public class ArrayIndexOutofBoundsExceptions {
	static void generateException(String[] names) {
		System.out.println(names[10]);
	}
	static void handleException(String[] names) {
		try {
			System.out.println(names[10]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Handled");
		} catch(RuntimeException e) {
			System.out.println("Exception is handled using generic runtime excetion");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Names");
		int number = sc.nextInt();
		String[] names = new String[number];
		for(int i = 0; i < number; i++) {
			System.out.println("Enter "+(i+1)+" Name");
			names[i] = sc.next();
		}
		handleException(names);
	}

}
