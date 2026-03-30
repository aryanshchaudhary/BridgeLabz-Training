package core_java;
public class SearchInsertPosition_35 {
	public static void main(String[] args) {
		int[] nums = {1,2,5,6};
		int target = 3;
		int low = 0, high = nums.length-1;
		while(low<=high) {
			int mid = low + (high-low)/2;
			if(nums[mid]==target) {
				System.out.println(mid);
				return;
			}else if(nums[mid]<target) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		System.out.println(low);
	}
}
