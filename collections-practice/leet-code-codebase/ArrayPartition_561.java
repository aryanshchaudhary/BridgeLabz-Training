package week_5;
import java.util.*;
public class ArrayPartition_561 {
	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for(int i = 0; i < nums.length - 1; i += 2) {
			sum += Math.min(nums[i], nums[i+1]);
		}
		return sum;
	}
	public static void main(String[] args) {
		ArrayPartition_561 sol = new ArrayPartition_561();
		int[] nums = { 1, 4, 3, 2 };
		System.out.println(sol.arrayPairSum(nums));
	}
}
