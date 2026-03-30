package level_2;
import java.util.*;
public class TemperatureConverter {
	static double Fahrenheit(double c ) {
		return (c*9/5)+32;
	}
	static double Celsius(double f ) {
		return (f-32)*5/9;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Enter Celsius: ");
            double c = sc.nextDouble();
            System.out.println("Fahrenheit = " + Fahrenheit(c));
        } else if (choice == 2) {
            System.out.print("Enter Fahrenheit: ");
            double f = sc.nextDouble();
            System.out.println("Celsius = " + Celsius(f));
        }
        sc.close();
	}
}
