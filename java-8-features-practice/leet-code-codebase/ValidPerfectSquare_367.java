package week_6;
public class ValidPerfectSquare_367 {
	public boolean isPerfectSquare(int num) {
		long left = 1;
		long right = num;
		
		while(left <= right) {
			long mid = left + (right - left) / 2;
			long square = mid * mid;
			if (square == num) {
				return true;
			} else if (square < num) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		ValidPerfectSquare_367 vps = new ValidPerfectSquare_367();
		int num = 16;
		boolean result = vps.isPerfectSquare(num);
		System.out.println(result);
	}
}
