package level_1;
import java.util.Scanner;
public class Handshake {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students : ");
		int N = sc.nextInt();
		int totalHandshake = (N*(N-1))/2;
		System.out.println("The total number of possible handshake is " + totalHandshake);
	}
}
