package week_2;
import java.util.*;
public class ParagraphAnalyzer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the paragraph : ");
		String paragraph = sc.nextLine();
		if (paragraph == null || paragraph.trim().isEmpty()) {
			System.out.println("Paragraph is empty.");
		}
		String[] words = paragraph.trim().split("\\s+");
		System.out.println("Word Count: " + words.length);
		String longest = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i].replaceAll("[^a-zA-Z]", "");
			if (word.length() > longest.length()) {
				longest = word;
			}
		}
		System.out.println("Lonest Word: " + longest);
		System.out.print("Enter word to replace: ");
		String oldWord = sc.next();

		System.out.print("Enter new word: ");
		String newWord = sc.next();
		String updated = paragraph.replaceAll("(?i)\\b" + oldWord + "\\b", newWord);

		System.out.println("Updated Paragraph:");
		System.out.println(updated);
		sc.close();
	}
}
