package l_2;
import java.util.*;
public class AddDigit_258 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		if(num==0) {
			System.out.println(0);
		}else if (num % 9 == 0) {
			System.out.println(9);
		}else {
			System.out.println(num%9);
		}
		sc.close();
	}
}
