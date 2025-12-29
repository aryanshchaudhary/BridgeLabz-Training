package level_3;
import java.util.*;
public class NumberChecker4 {
	static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;

        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }
    static boolean isSpy(int num) {
        int sum = 0;
        int product = 1;
        while (num != 0) {
            int d = num % 10;
            sum += d;
            product *= d;
            num /= 10;
        }
        return sum == product;
    }
    static boolean isAutomorphic(int num) {
        int square = num * num;
        int temp = num;

        while (temp != 0) {
            if (temp % 10 != square % 10)
                return false;
            temp /= 10;
            square /= 10;
        }
        return true;
    }
    static boolean isBuzz(int num) {
        return (num % 7 == 0 || num % 10 == 7);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Prime Number      : " + isPrime(num));
        System.out.println("Neon Number       : " + isNeon(num));
        System.out.println("Spy Number        : " + isSpy(num));
        System.out.println("Automorphic Number: " + isAutomorphic(num));
        System.out.println("Buzz Number       : " + isBuzz(num));
    }
}
