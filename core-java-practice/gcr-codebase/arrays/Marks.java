package level_2;
import java.util.*;
public class Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Students : ");
		int num = sc.nextInt();
		double[] marks = new double[num];
		double[] percentage = new double[num];
		char[] grades = new char[num];
		for(int i = 0;i<num;i++) {
			System.out.println("Enter the marks in physics of " + (i+1) + " student: ");
			double phy = sc.nextDouble();
			System.out.println("Enter the marks in chemistry of " + (i+1) + " student: ");
			double chem = sc.nextDouble();
			System.out.println("Enter the marks in maths of " + (i+1) + " student: ");
			double maths = sc.nextDouble();
			if (phy < 0 || chem < 0 || maths < 0) {
                System.out.println("Invalid marks!");
                i--;
                continue;
            }
			percentage[i]=(phy+chem+maths)/3;
			if (percentage[i] >= 80) grades[i] = 'A';
            else if (percentage[i] >= 70) grades[i] = 'B';
            else if (percentage[i] >= 60) grades[i] = 'C';
            else if (percentage[i] >= 50) grades[i] = 'D';
            else if (percentage[i] >= 40) grades[i] = 'E';
            else grades[i] = 'R';
		}
		System.out.println("\nS.No \tPercent \tGrade");
		for(int i = 0; i<num;i++) {
			System.out.println((i + 1) + "\t " + percentage[i] + "\t " + grades[i]);
		}
		sc.close();
	}
}
