package map_interface;
import java.util.*;
public class WordFrequency {
	public static void main(String[] args) {
		String text = "hello world, hello Java!";
		
		Map<String, Integer> wordCount = new HashMap<>();
		
		text = text.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "");
		String[] words = text.split("\\s+");
		
		for (String word : words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}
		System.out.println("Word Frequencies: " + wordCount);
	}
}
