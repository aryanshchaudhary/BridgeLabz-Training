package level_1;
import java.util.Scanner;
public class CountDown2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count-down: ");
		int counter = sc.nextInt();
		for (int i = counter; i>=1; i--) {
			System.out.println(i);
		}
	}
}
