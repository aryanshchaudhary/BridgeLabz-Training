package level_2;
import java.util.*;
public class Factors {
	static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }
    static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }
    static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }
    static double sumOfSquares(int[] factors) {
        double sum = 0;
        for (int f : factors) sum += Math.pow(f, 2);
        return sum;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int[] factors = findFactors(num);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nSum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
		sc.close();
	}
}
