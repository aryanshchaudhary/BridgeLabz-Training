package level_2;
import java.util.Scanner;
public class DoubleOpt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the values of a: ");
		double a = sc.nextDouble();
		System.out.print("Enter the values of b: ");
		double b = sc.nextDouble();
		System.out.print("Enter the values of c: ");
		double c = sc.nextDouble();
		
		double opt1 = a+b*c;
		double opt2 = a*b+c;
		double opt3 = c+a/b;
		double opt4 = a%b+c;
		System.out.println("Output of operation 1 is " + opt1);
		System.out.println("Output of operation 2 is " + opt2);
		System.out.println("Output of operation 3 is " + opt3);
		System.out.println("Output of operation 4 is " + opt4);
	}
}
