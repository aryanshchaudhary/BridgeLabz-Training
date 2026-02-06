package week_6;

public class FindtheDifference_389 {
	public char findTheDifference(String s, String t) {
		int result = 0;
		for(char c : s.toCharArray()) {
			result ^= c;
		}
		for (char c : t.toCharArray()) {
			result ^= c;
		}
		return (char) result;
	}
	public static void main(String[] args) {
		FindtheDifference_389 finder = new FindtheDifference_389();
		String s = "abcd";
		String t = "abcde";
		System.out.println(finder.findTheDifference(s, t));
	}
}
