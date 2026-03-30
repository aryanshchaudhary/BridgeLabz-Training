package practice_problem;
import java.util.Scanner;
public class AreaofaCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of circle:");
		double Radius = sc.nextInt();
		double Area = (Math.PI * (Radius * Radius));
		System.out.println("The area of Circle=" + Area);

	}

}
