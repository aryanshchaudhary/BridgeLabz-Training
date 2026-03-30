package level_1;
import java.util.*;
public class Rounds {
	static double getRounds(double s1, double s2, double s3) {
		double perimeter = s1 + s2 + s3;
		return 5000/perimeter;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side 1 in meter : ");
		double s1 = sc.nextDouble();
		System.out.print("Enter side 2 in meter : ");
		double s2 = sc.nextDouble();
		System.out.print("Enter side 3 in meter : ");
		double s3 = sc.nextDouble();
		double totalRounds = getRounds(s1,s2,s3);
		System.out.println("The total rounds = " + totalRounds);
		sc.close();
	}
}
