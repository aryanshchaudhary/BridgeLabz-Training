package level_2;
import java.util.Scanner;
public class IntOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the values of a: ");
		int a = sc.nextInt();
		System.out.print("Enter the values of b: ");
		int b = sc.nextInt();
		System.out.print("Enter the values of c: ");
		int c = sc.nextInt();
		
		int opt1 = a+b*c;
		int opt2 = a*b+c;
		int opt3 = c+a/b;
		int opt4 = a%b+c;
		System.out.println("Output of operation 1 is " + opt1);
		System.out.println("Output of operation 2 is " + opt2);
		System.out.println("Output of operation 3 is " + opt3);
		System.out.println("Output of operation 4 is " + opt4);
	}
}
