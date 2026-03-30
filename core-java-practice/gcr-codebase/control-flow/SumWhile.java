package level_1;
import java.util.Scanner;
public class SumWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		if(n<=0) {
			System.out.println("Not a natural Number");
			return;
		}
		int sum1 = 0;
		int i = 1;
		while (i<=n) {
			sum1 +=i;
			i++;
		}
		int sum2 = (n*(n+1))/2;
		boolean compare = (sum1==sum2);
		System.out.println("The sum using while loop is " + sum1);
		System.out.println("The sum using formula is " + sum2);
		System.out.println("Final Comparison " + compare);
	}
}
