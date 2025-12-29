package level_2;
import java.util.*;
public class PrimeNumber {
	static boolean isPrime(int num) {
		if(num<=1) return false;
		for(int i=2; i<=num/2;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		if(isPrime(num))
			System.out.println("It is a Prime Number");
		else
			System.out.println("Not a Prime Number");
		sc.close();
	}
}
