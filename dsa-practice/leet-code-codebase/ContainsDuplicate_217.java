package week_3;
public class ContainsDuplicate_217 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		boolean found = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					found = true;
					break;
				}
			}
			if (found)
				break;
		}
		System.out.println(found);
	}
}
