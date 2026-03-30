package level_3;
import java.util.*;
public class NumberChecker5 {
	static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum += i;
        }
        return sum;
    }
    static boolean isPerfect(int num) {
        return sumOfDivisors(num) == num;
    }
    static boolean isAbundant(int num) {
        return sumOfDivisors(num) > num;
    }
    static boolean isDeficient(int num) {
        return sumOfDivisors(num) < num;
    }
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    static boolean isStrong(int num) {
        int temp = num;
        int sum = 0;

        while (temp != 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }
        return sum == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Perfect Number  : " + isPerfect(num));
        System.out.println("Abundant Number : " + isAbundant(num));
        System.out.println("Deficient Number: " + isDeficient(num));
        System.out.println("Strong Number   : " + isStrong(num));
    }
}
