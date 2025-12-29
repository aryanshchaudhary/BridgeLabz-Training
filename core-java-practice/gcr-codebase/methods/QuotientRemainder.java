package level_1;
import java.util.*;
public class QuotientRemainder {
	static int[] remainderQuotient(int number, int divisor) {
        return new int[]{number / divisor, number % divisor};
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();
        int[] result = remainderQuotient(number, divisor);
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
		sc.close();
	}
}
