package week_3;
import java.util.*;
public class UglyNumber_263 {
	public static boolean isUgly(int n) {
		if(n<1) {
			return false;
		}
		while (n % 2 == 0) {
			n /= 2;
		}
		while (n % 3 == 0) {
			n /= 3;
		}
		while (n % 5 == 0) {
			n /= 5;
		}
		return n == 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		boolean result = isUgly(n);
		System.out.println("Is the number ugly? " + result);
		sc.close();
	}
}
