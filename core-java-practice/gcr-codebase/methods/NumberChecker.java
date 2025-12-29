package level_3;
import java.util.*;
public class NumberChecker {
	static int countDigits(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		return count;
	}
	static int[] getDigits(int n) {
		int[] digits = new int[countDigits(n)];
		int i = countDigits(n) - 1;
		while (n > 0) {
			digits[i--] = n % 10;
			n /= 10;
		}
		return digits;
	}
	static void print(int n) {
		int[] digits = getDigits(n);
		System.out.println();
		for (int d : digits) {
			System.out.print(d);
		}
		System.out.println();
	}
	static boolean isDuckNumber(int n) {
		int[] digits = getDigits(n);
		int start = 0, end = digits.length - 1;
		while (digits[start] == 0)
			start++;
		while (digits[end] == 0)
			end--;
		for (int i = start; i <= end; i++)
			if (digits[i] == 0)
				return true;
		return false;
	}
	static boolean isArmstrongNumber(int n) {
		int digitSum = 0;
		int[] digits = getDigits(n);
		int count = countDigits(n);
		for (int d : digits) {
			digitSum += Math.pow(d, count);
		}
		if (n == digitSum)
			return true;
		return false;
	}
	static int[] findLargestSecondLargest(int n) {
		int[] digits = getDigits(n);
		int largest = Integer.MIN_VALUE, secondLargest = 0;
		for (int i = 0; i < digits.length; i++) {
			if (largest < digits[i]) {
				secondLargest = largest;
				largest = digits[i];
			} else if (secondLargest < digits[i] && largest != digits[i]) {
				secondLargest = digits[i];
			}
		}
		return new int[] { largest, secondLargest };
	}
	static int[] findSmallestSecondSmallest(int n) {
		int[] digits = getDigits(n);
		int smallest = Integer.MAX_VALUE, secondSmallest = 0;
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] < smallest) {
				secondSmallest = smallest;
				smallest = digits[i];
			} else if (secondSmallest > digits[i] && smallest != digits[i]) {
				secondSmallest = digits[i];
			}
		}

		return new int[] { smallest, secondSmallest };
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		print(n);
		System.out.println("is Duck number : " + isDuckNumber(n));
		System.out.println("is Armstrong number : " + isArmstrongNumber(n));
		int[] largest = findLargestSecondLargest(n);
		int[] smallest = findSmallestSecondSmallest(n);
		System.out.println("largest : " + largest[0] + " second largest : " + largest[1]);
		System.out.println("smallest : " + smallest[0] + " second smallest : " + smallest[1]);
		sc.close();
	}
}
