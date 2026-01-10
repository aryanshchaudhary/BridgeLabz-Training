package l_2;
public class SingleNumber_136 {
	public static void main(String[] args) {
		int[] nums = {4,2,1,2,1};
		int value = 0;
		for(int i = 0; i<nums.length; i++) {
			value = value ^ nums[i];
		}
		System.out.println(value);
	}
}
