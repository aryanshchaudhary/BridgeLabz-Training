package level_1;
import java.util.Scanner;
public class TriangleArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base in cm");
		double base = sc.nextDouble();
		System.out.print("Enter the height in cm");
		double height = sc.nextDouble();
		double Area_sqCM = 0.5*base*height;
		double Area_sqInches = Area_sqCM / 6.4516;
		System.out.println("Area in square centimeters is " + Area_sqCM +
				" and in square inches is " + Area_sqInches);
	}
}
