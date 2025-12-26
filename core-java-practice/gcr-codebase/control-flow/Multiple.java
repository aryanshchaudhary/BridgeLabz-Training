package level_2;
import java.util.*;
public class Multiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		if (num>0 && num<100) {
			for ( int i =100; i>=1; i--) {
				if(num%i==0)
					System.out.println(i);
			}
		} else {
			System.out.println("Invalid Input");
		}
		sc.close();
	}
}
