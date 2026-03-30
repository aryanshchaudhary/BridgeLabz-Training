package linear_binary_search;
public class SearchWord {
	public static String findWord(String[] sentences, String word) {
		for(String sentence : sentences) {
			if (sentence.contains(word)) {
				return sentence;
			}
		}
		return "Not Found";
	}
	public static void main(String[] args) {
		String[] sentences = { "Hello world", "Java is fun", "OpenAI creates AI models" };
		
		String word = "fun";
		String result = findWord(sentences, word);
		System.out.println(result);
		
	}
}
