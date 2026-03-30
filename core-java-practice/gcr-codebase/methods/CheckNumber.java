package level_1;
import java.util.*;
public class CheckNumber {
	static int numType(int num) {
		if(num>0)
			return 1;
		if(num==0)
			return 0;
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		System.out.println("The number is " + numType(n));
		sc.close();
	}
}
