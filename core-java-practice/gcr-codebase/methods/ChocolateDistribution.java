package level_1;
import java.util.*;
public class ChocolateDistribution {
	static int[] distribute(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of chocolates : ");
		int c = sc.nextInt();
		System.out.print("Enter the number of children : ");
		int child = sc.nextInt();
		int[] result = distribute(c, child);
        System.out.println("Each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
		sc.close();
	}
}
