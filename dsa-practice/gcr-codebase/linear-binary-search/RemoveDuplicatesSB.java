package linear_binary_search;
import java.util.HashSet;
public class RemoveDuplicatesSB {
	public static void main(String[] args) {
		String str = "ramamama";
		StringBuilder sb = new StringBuilder();
		HashSet<Character> s = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!s.contains(ch)) {
				s.add(ch);
				sb.append(ch);
			}
		}
		String result = sb.toString();
		System.out.println("String after removing duplicates: " + result);
		
	}
}
