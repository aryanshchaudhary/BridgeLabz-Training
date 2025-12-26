package level_1;
import java.util.*;
public class Bonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the salary : ");
		double salary = sc.nextDouble();
		System.out.print("Enter the year of service : ");
		double n = sc.nextDouble();
		if (n>5) {
			double bonus= salary*(5.0/100);
			System.out.println("The bonus is " + bonus);
		}else {
			System.out.println("No bonus and the salary is " + salary);
		}
		sc.close();
	}
}
