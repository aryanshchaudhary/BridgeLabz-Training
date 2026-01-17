package week_3;
import java.util.*;
public class ReverseStringII_541 {
	static String reverseStr(String s, int k) {
		char[] arr = s.toCharArray();
		int n = arr.length;
		
		for(int i = 0; i < n; i += 2 * k) {
			int left = i;
			int right = Math.min(i + k - 1, n - 1);
			while (left < right) {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		return new String(arr);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string s : ");
		String s = sc.nextLine();
		System.out.print("Enter the integer k : ");
		int k = sc.nextInt();
		String result = reverseStr(s, k);
		System.out.println(result);
		sc.close();
	}
}
