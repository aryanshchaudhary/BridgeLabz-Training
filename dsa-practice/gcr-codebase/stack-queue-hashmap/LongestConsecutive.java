package stack_queue_hashmap;
import java.util.HashSet;
public class LongestConsecutive {
	static int longest(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for (int x : arr) set.add(x);
		int maxLength = 0;
		for (int x : arr) {
			if (!set.contains(x - 1)) {
				int length = 1;
				while (set.contains(x + length)) {
					length++;
				}
				maxLength = Math.max(maxLength, length);
			}
		}
		return maxLength;
	}
	public static void main(String[] args) {
		int[] arr = { 100, 4, 200, 1, 3, 2, 101, 102, 103, 104 };
		System.out.println(longest(arr));
	}
}
