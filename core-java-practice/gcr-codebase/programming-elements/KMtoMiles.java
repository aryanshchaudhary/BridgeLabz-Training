package level_1;
import java.util.Scanner;
public class KMtoMiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter distance in kilometers: ");
		double KM = sc.nextDouble();
		double Miles = KM/1.6;
		System.out.println("The total miles is " 
		+ Miles + " miles for the given " + KM + "km");
	}
}
