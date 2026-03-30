package week_7;
public class MaxConsecutiveOnes_485 {
	public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int num : nums){
            if(num == 1){
                count++;
                max = Math.max(max,count);
            }else{
                count = 0;
            }
        }
        return max;
    }
	public static void main(String[] args) {
		MaxConsecutiveOnes_485 solution = new MaxConsecutiveOnes_485();
		int[] nums = { 1, 1, 0, 1, 1, 1 };
		int result = solution.findMaxConsecutiveOnes(nums);
		System.out.println("Max Consecutive Ones: " + result);
	}
}
