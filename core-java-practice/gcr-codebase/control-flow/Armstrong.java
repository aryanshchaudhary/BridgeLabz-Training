package level_3;
import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		int originalNumber = num;
		while(num>0) {
			int a = num%10;
			double digitCube=Math.pow(a, 3);
			sum+=digitCube;
			num/=10;
		}
		if (originalNumber==sum) {
			System.out.println("Number is Armstrong");
		}else {
			System.out.println("Number is not Armstrong");
		}
		sc.close();
	}
}
