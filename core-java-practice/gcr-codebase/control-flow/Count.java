package level_3;
import java.util.*;
public class Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int number = num;
		int digits = 0;
		
		while (num > 0) {
			digits++;
			num /= 10;
		}
		System.out.println("Digits in " + number + " : " + digits);
		sc.close();
	}
}
