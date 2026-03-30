package week_6;
public class NimGame_292 {
	public boolean canWinNim(int n) {
		return n % 4 != 0;
	}
	public static void main(String[] args) {
		NimGame_292 ng = new NimGame_292();
		int n = 7;
		boolean result = ng.canWinNim(n);
		System.out.println(result);
	}
}
