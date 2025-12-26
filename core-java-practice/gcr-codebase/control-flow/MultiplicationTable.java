package level_1;
import java.util.*;
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		for(int i=6; i<=9; i++) {
			System.out.println(n + " x " + i + " = " + (n*i) );
		}
		sc.close();
	}
}
