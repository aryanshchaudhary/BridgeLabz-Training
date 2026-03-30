package level_2;
import java.util.*;
public class FactorWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		if(num<0) {
			System.out.println("Please enter a positive number");
			return;
		}
		int i = 1;
		while (i<num) {
			if(num%i==0)
				System.out.println(i);
			i++;
		}
		sc.close();
	}
}
