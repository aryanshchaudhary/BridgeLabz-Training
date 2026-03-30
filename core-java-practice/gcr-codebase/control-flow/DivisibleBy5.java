package level_1;
import java.util.Scanner;
public class DivisibleBy5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		String result;
		if(num%5==0) {
			result =  "Divisible";
		} else {
			result = "Not Divisible";
		}
		System.out.println("Is the number " + num + " divisible by 5? " + result );
	}
}
