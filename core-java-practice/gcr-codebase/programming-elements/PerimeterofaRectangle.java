package practice_problem;
import java.util.Scanner;
public class PerimeterofaRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length:");
		double Length = sc.nextDouble();
		System.out.print("Enter the Breadth");
		double Breadth = sc.nextDouble();
		double Perimeter = 2 * (Length + Breadth);
		System.out.println("The perimeter is=" + Perimeter);
	}

}
