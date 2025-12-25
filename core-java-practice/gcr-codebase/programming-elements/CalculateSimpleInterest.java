package practice_problem;
import java.util.Scanner;
public class CalculateSimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principal");
		double Principal = sc.nextDouble();
		System.out.print("Enter the Rate");
		double Rate = sc.nextDouble();
		System.out.print("Enter the Time");
		double Time = sc.nextDouble();
		double SI = (Principal * Rate * Time)/100;
		System.out.println("The Simple Interest is=" + SI);
		
	}

}
