package linear_binary_search;
public class CancatStringSB {
	public static void main(String[] args) {
		String[] words = {"Hello", " ", "World", "!"};
		StringBuffer sb = new StringBuffer();
		for (String word : words) {
			sb.append(word);
		}
		String result = sb.toString();
		System.out.println("Concatenated String: " + result);
	}
}
