package week_5;
import java.util.*;
public class MaximumProductofThreeNumbers_628 {
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		
		int case1 = nums[n-1]*nums[n-2]*nums[n-3];
		int case2 = nums[0]*nums[1]*nums[n-1];
		
		return Math.max(case1, case2);
	}
	public static void main(String[] args) {
		MaximumProductofThreeNumbers_628 sol = new MaximumProductofThreeNumbers_628();
		int[] nums = { -4, -3, -2, -1, 60 };
		System.out.println(sol.maximumProduct(nums));
	}
}
