package level_3;
import java.util.*;
public class BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the weight (in kg) : ");
		double weight = sc.nextDouble();
		System.out.print("Enter the height (in cm) : ");
		double heightCM = sc.nextDouble();
		double heightM = heightCM/100.0;
		double BMI = weight/(heightM*heightM);
		if (BMI>=40.0) {
			System.out.println("BMI: " + BMI + "\nStatus : Obese");
		}else if(BMI>=25.0 && BMI<40) {
			System.out.println("BMI: " + BMI + "\nStatus : Overweight");
		}else if(BMI>=18.5 && BMI<25) {
			System.out.println("BMI: " + BMI + "\nStatus : Normal");
		}else {
			System.out.println("BMI: " + BMI + "\nStatus : Underweight");
		}
		sc.close();
	}
}
