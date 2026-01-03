package review;
import java.util.*;
public class SearchTarget {
	public static int search(int[] numbers, int target) {
		int low = 0;
		int high = numbers.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (numbers[mid] == target) {
				return mid;
			} else if (numbers[low] <= numbers[mid]) {
				if (target >= numbers[low] && target <= numbers[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (target >= numbers[mid] && target <= numbers[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = { 4, 5, 6, 7, 0, 1, 2 };
		int target = sc.nextInt();
		int result = search(numbers, target);
		System.out.println(result);
	}
}
