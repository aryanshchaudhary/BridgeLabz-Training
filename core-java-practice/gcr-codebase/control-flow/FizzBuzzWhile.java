package level_2;
import java.util.*;
public class FizzBuzzWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		if (num > 0) {
			int i = 1;
			while (i <= num) {
				if (i % 5 == 0 && i % 3 == 0) {
					System.out.println("FizzBuzz");
				} else if (i % 3 == 0) {
					System.out.println("Fizz");
				} else if (i % 5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(i);
				}
				i++;
			}
		} else {
			System.out.println("number not positive.");
		}
		
		sc.close();
	}
}
