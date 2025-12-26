package level_1;
import java.util.*;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		if (n<=0) {
			System.out.println("Please enter a natural number");
			return;
		}
		for(int i=1; i<=n; i++) {
			if (i%2==0) {
				System.out.println(i + " Even");
			} else {
				System.out.println(i + " Odd");
			}	
		}
		sc.close();
	}
}
