package scenario_based;
import java.util.*;
public class BMIFitnessTracker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the weight in kg : ");
		double weight = sc.nextDouble();
		System.out.print("Enter the height in meters : ");
		double height = sc.nextDouble();
		double bmi = weight/(height*height);
		// indicates the status of BMI
		System.out.println("BMI = " + bmi);
		if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }
		sc.close();
	}
}
