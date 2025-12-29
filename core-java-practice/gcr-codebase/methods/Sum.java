package level_1;
import java.util.*;
public class Sum {
	static int getSum(int num) {
		int sum=0;
		for(int i = 1;i<=num;i++ ) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		System.out.println("The sum is "+ getSum(n));
		sc.close();
	}
}
