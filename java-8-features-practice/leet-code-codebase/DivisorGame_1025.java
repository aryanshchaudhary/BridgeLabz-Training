package week_6;
import java.util.*;
public class DivisorGame_1025 {
	public boolean divisorGame(int n) {
		return(n % 2 == 0);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		sc.close();
		DivisorGame_1025 obj = new DivisorGame_1025();
		System.out.println(obj.divisorGame(n));
	}
}
