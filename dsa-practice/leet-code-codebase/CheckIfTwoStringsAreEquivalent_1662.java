package week_3;

public class CheckIfTwoStringsAreEquivalent_1662 {
	static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String result1 = "";
		for (String str : word1) {
			result1 += str;
		}
		String result2 = "";
		for (String str : word2) {
			result2 += str;
		}
		if (result1.equals(result2)) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		String[] word1 = {"ab", "c"};
		String[] word2 = {"a", "bc"};
		boolean result = arrayStringsAreEqual(word1, word2);
		System.out.println(result);
	}
}