package leetcode;
import java.util.*;
public class TwoSum1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = 9;
		int[] nums = {2,7,11,15};
		for(int i=0; i<nums.length; i++) {
			for(int j = i+1; j<nums.length; j++) {
				if(nums[i] + nums[j]== target) {
					System.out.println("[" + i + " " + j + "]");
				}
			}
		}
		sc.close();
	}
}
