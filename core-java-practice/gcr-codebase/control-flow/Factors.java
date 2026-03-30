package level_2;
import java.util.*;
public class Factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		if(num<0) {
			System.out.println("Please enter a positive number");
			return;
		}
		for (int i = 1; i <num; i++ ) {
			if (num%i==0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
