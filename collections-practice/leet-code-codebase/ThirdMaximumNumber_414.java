package week_5;
public class ThirdMaximumNumber_414 {
	public int thirdMax(int[] nums) {
        Long a = null, b = null, c = null;

        for(int i = 0; i < nums.length; i++){
            long n = nums[i];

            if((a != null && n == a) ||
            (b != null && n == b) ||
            (c != null && n == c)){
                continue;
            }
            if(a == null || n > a){
                c = b;
                b = a;
                a = n;
            }
            else if(b == null || n > b){
                c = b;
                b = n;
            }else if(c == null || n > c){
                c = n;
            }
        }
        return(c == null)? a.intValue() : c.intValue();
    }
	public static void main(String[] args) {
		ThirdMaximumNumber_414 obj = new ThirdMaximumNumber_414();
		int[] nums = { 3, 2, 1 };
		int result = obj.thirdMax(nums);
		System.out.println("Third Maximum Number: " + result);
	}
}
