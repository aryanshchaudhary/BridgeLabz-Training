package level_3;
import java.util.*;
public class NumberChecker3 {
	static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
    static int[] getDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }
    static int[] reverseArray(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            rev[i] = digits[digits.length - 1 - i];
        }
        return rev;
    }
    static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
    static boolean isPalindrome(int[] digits) {
        int[] rev = reverseArray(digits);
        return compareArrays(digits, rev);
    }
    static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] digits = getDigits(num);
        System.out.println("Digits         : " + Arrays.toString(digits));
        System.out.println("Reversed Digits: " + Arrays.toString(reverseArray(digits)));
        System.out.println("Palindrome     : " + isPalindrome(digits));
        System.out.println("Duck Number    : " + isDuckNumber(digits));
    }
}
