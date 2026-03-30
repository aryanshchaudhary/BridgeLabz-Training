package stack_queue_hashmap;

import java.util.HashMap;

public class TwoSum {
	static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			int rem = target - nums[i];
			if (map.containsKey(rem)) 
				return new int[] { map.get(rem), i };
			map.put(nums[i], i);
			}
		return new int[] {};
	}

	public static void main(String[] args) {
		int[] nums = {12, 7, 14, 25};
		int target = 39;
		int[] result = twoSum(nums, target);
		System.out.println(result[0] + ", " + result[1]);
	}
}