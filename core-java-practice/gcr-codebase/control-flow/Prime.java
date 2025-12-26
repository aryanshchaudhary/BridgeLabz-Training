package level_3;
import java.nio.file.spi.FileSystemProvider;
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		if (num<=1) {
			System.out.println("Enter valid number");
			return;
		}
		for(int i = 2;i<num;i++) {
			if(num % i == 0) {
				System.out.println("Number is not prime");
				return;
			}
		}
		System.out.println("Number is Prime");
		sc.close();
	}
}
