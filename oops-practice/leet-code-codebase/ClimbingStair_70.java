package l_2;
import java.util.*;
public class ClimbingStair_70 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of steps : ");
		int num = sc.nextInt();
		if(num<=3) {
			System.out.println(num);
		}
		int a = 3, b = 2;
		for(int i = 0; i<num-3;i++) {
			a = a + b;
			b = a - b;
		}
		System.out.println(a);
		sc.close();
	}
}
