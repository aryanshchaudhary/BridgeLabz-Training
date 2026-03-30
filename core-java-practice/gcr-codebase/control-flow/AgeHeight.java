package level_2;
import java.util.*;
public class AgeHeight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age of Amar : ");
		int ageAmar = sc.nextInt();
		System.out.print("Enter the height of Amar : ");
		int heightAmar = sc.nextInt();
		System.out.print("Enter the age of Akbar : ");
		int ageAkbar = sc.nextInt();
		System.out.print("Enter the height of Akbar : ");
		int heightAkbar = sc.nextInt();
		System.out.print("Enter the age of Anthony : ");
		int ageAnthony = sc.nextInt();
		System.out.print("Enter the height of Anthony : ");
		int heightAnthony = sc.nextInt();
		if (ageAmar<ageAkbar && ageAmar<ageAnthony) {
			System.out.println("Amar is Youngest");
		}else if (ageAkbar<ageAmar && ageAkbar<ageAnthony) {
			System.out.println("Akbar is Youngest");
		}else {
			System.out.println("Anthony is Youngest");
		}
		if (heightAmar>heightAkbar && heightAmar>heightAnthony) {
			System.out.println("Amar is Tallest");
		}else if (heightAkbar>heightAmar && heightAkbar>heightAnthony) {
			System.out.println("Akbar is Tallest");
		}else {
			System.out.println("Anthony is Tallest");
		}
		sc.close();
	}
}
