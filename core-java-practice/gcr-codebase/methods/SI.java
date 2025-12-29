package level_1;
import java.util.*;
public class SI {
	static double calcSI(double Principal, double Rate, double Time) {
		return (Principal*Rate*Time)/100;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principal : ");
		int p = sc.nextInt();
		System.out.print("Enter the Rate : ");
		int r = sc.nextInt();
		System.out.print("Enter the Time : ");
		int t = sc.nextInt();
		double si = calcSI(p,r,t);
		System.out.println("The Simple Interest is " + si + 
				" for Principal " + p + 
				", Rate of Interest " + 
				" and Time " + t);
		sc.close();
	}
}
