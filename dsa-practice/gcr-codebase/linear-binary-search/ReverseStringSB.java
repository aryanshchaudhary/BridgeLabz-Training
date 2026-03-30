package linear_binary_search;

public class ReverseStringSB {
	public static void main(String[] args) {
		String s = "hello";
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String rev = sb.toString();
		System.out.println("Reversed String: " + rev);
	}
}
