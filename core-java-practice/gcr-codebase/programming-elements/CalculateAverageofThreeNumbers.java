package practice_problem;
import java.util.Scanner;
public class CalculateAverageofThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number");
		int a = sc.nextInt();
		System.out.print("Enter the Second Number");
		int b = sc.nextInt();
		System.out.print("Enter the Third Number");
		int c = sc.nextInt();
		int Average = (a + b +  c)/3;
		System.out.println("The average is=" + Average);
	}

}
