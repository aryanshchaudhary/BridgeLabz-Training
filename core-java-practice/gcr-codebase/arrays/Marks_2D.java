package level_2;
import java.util.*;
public class Marks_2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students : ");
		int num = sc.nextInt();
		double[][] marks = new double[num][3];
		double[] percentage = new double[num];
		char[] grade = new char[num];
		for(int i = 0; i<num; i++) {
			System.out.println("Enter the marks for student" + (i+1));
			System.out.print("Physics: ");
            marks[i][0] = sc.nextDouble();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextDouble();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextDouble();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks.");
                i--;
                continue;
            }
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else
                grade[i] = 'D';
        }
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < num; i++) {
            System.out.printf("%d\t%.1f\t%.1f\t\t%.1f\t%.2f\t\t%c\n",
                    (i + 1),
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    percentage[i],
                    grade[i]);   
		}
		sc.close();
	}
}
