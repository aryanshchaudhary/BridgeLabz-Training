package practice_problem;
import java.util.Scanner;
public class ConvertKilometerstoMiles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter distance in Kilometers:");
		double Kilometers = sc.nextDouble();
		double Miles = Kilometers * 0.621371;
		System.out.print("The distance in Miles=" + Miles);

	}

}
