package level_2;
import java.util.*;
public class PowerWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		System.out.print("Enter the power : ");
		int pow = sc.nextInt();
		int result = 1;
		int counter = 0;
		while(counter < pow) {
			result = result*num;
			counter++;
		}
		System.out.println(result);
		sc.close();
	}
}
