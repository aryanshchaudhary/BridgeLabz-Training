package level_3;
import java.util.*;
public class Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks of physics : ");
		double phy = sc.nextDouble();
		System.out.print("Enter the marks of  : ");
		double chem = sc.nextDouble();
		System.out.print("Enter the marks of physics : ");
		double maths = sc.nextDouble();
		double average = (phy + chem + maths) / 3.0;
        System.out.println("Average Marks = " + average);

        if (average>=80) {
            System.out.println("Grade A : above agency-normalized standards");
        } else if (average>=70 && average<=79) {
            System.out.println("Grade B : at agency-normalized standards");
        } else if (average>=60 && average<=69) {
            System.out.println("Grade C : below, but approaching agency-normalized standards");
        } else if (average>=50 && average<=59) {
            System.out.println("Grade D : well below agency-normalized standards");
        } else if (average>=40 && average<=49) {
            System.out.println("Grade E : too below agency-normalized standards");
        } else {
        	System.out.println("Grade R : Remedial standards");
        }
		sc.close();
	}
}
