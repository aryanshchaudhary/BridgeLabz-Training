package week_5;
import java.util.*;
public class PowerofFour_342 {
	public boolean isPowerOfFour(int n) {
		if(n <= 0) {
			return false;
		}
		while(n % 4 == 0) {
			n /= 4;
		}
		return n == 1;
	}
	public static void main(String[] args) {
		PowerofFour_342 p = new PowerofFour_342();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		boolean result = p.isPowerOfFour(n);
		System.out.println(result);
		sc.close();
	}
}
