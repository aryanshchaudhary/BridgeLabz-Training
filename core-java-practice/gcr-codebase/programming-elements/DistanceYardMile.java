package level_1;
import java.util.Scanner;
public class DistanceYardMile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter distance in feet:");
		double feet = sc.nextDouble();
		double yard = feet/3;
		double mile = yard/1760;
		System.out.println("The distance in yard is " 
		+ yard + " and the distance in mile is " + mile);
	}
}
