package week_6;
import java.util.*;
public class FindAllNumbersDisappearedinanArray_448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] > 0) {
				nums[index] = -nums[index];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				result.add(i + 1);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		FindAllNumbersDisappearedinanArray_448 finder = new FindAllNumbersDisappearedinanArray_448();
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> disappearedNumbers = finder.findDisappearedNumbers(nums);
		System.out.println(disappearedNumbers);
	}
}
