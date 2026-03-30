package week_5;
import java.util.*;
public class FibonacciNumber_509 {
	public int fib(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}
	public static void main(String[] args) {
		FibonacciNumber_509 f = new FibonacciNumber_509();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int num = f.fib(n);
		System.out.println(num);
		sc.close();
	}
}
