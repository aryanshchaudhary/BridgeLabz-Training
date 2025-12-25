package level_1;
import java.util.Scanner;
public class ConvertHeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter height in cm: ");
        double CM = sc.nextDouble();

        double Inches = CM / 2.54;
        double Feet =  (Inches / 12);

        System.out.println("Your Height in cm is " + CM +
                " while in feet is " + Feet +
                " and inches is " + Inches);
	}
}
