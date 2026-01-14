package stack_queue_hashmap;
import java.util.HashSet;
public class PairSum {
	static boolean hasPair(int[] arr, int target) {
		HashSet<Integer> set = new HashSet<>();
		for(int x : arr) {
			if (set.contains(target - x)) {
				return true;
			}
			set.add(x);
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr = { 10, 15, 3, 7 };
		int target = 20;
		System.out.println(hasPair(arr, target));
	}
}
