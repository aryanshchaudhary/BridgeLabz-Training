package level_1;
import java.util.Scanner;
public class CountDown1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count-down: ");
		int counter = sc.nextInt();
		while(counter>=1) {
			System.out.println(counter);
			counter--;
		}
	}
}