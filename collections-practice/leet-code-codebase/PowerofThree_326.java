package week_5;
public class PowerofThree_326 {
	public boolean isPowerofThree(int n) {
		if(n <= 0) {
			return false;
		}
		while(n % 3 == 0) {
			n /= 3;
		}
		return n == 1;
	}
	public static void main(String[] args) {
		PowerofThree_326 obj = new PowerofThree_326();
		int n = 29;
		boolean result = obj.isPowerofThree(n);
		System.out.println(result);
	}
}
