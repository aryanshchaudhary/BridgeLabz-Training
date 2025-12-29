package level_2;
import java.util.*;
public class GCDLCM {
	static int GCD(int a, int b) {
		while (b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	static int LCM(int a, int b) {
		return (a*b)/GCD(a,b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first numbers : ");
		int a = sc.nextInt();
		System.out.print("Enter the second numbers : ");
		int b = sc.nextInt();
		System.out.println("GCD = " + GCD(a, b));
        System.out.println("LCM = " + LCM(a, b));
		sc.close();
	}
}
