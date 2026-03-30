package week_7;
import java.util.Arrays;

public class LargestPerimeterTriangle_976 {
	public int largestPerimeter(int[] nums) {
		Arrays.sort(nums);
		for (int i = nums.length - 1; i >= 2; i--) {
			if (nums[i] < nums[i - 1] + nums[i - 2]) {
				return nums[i] + nums[i - 1] + nums[i - 2];
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		LargestPerimeterTriangle_976 solution = new LargestPerimeterTriangle_976();
		int[] nums = { 3, 6, 2, 3 };
		int result = solution.largestPerimeter(nums);
		System.out.println("Largest Perimeter: " + result); 
	}
}
