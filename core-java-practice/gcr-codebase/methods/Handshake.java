package level_1;
import java.util.*;
public class Handshake {
	static int getHandshake(int num) {
		return (num*(num-1))/2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students : ");
		int n = sc.nextInt();
		int handshake = getHandshake(n);
		System.out.println("The total number of handshakes are " + handshake);
		sc.close();
	}
}
