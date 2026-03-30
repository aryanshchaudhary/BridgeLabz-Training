package practice_problem;
import java.util.Scanner;
public class VolumeofaCylinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Radius:");
		double Radius = sc.nextDouble();
		System.out.print("Enter the Height:");
		double Height = sc.nextDouble();
		double Volume = Math.PI * (Radius * Radius) * Height;
		System.out.println("The Volume of Cylinder=" + Volume);

	}

}
