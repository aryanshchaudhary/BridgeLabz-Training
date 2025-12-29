package string_extras;
import java.util.*;
public class LongestWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence : ");
		String sen = sc.nextLine();
		String[] words=sen.split(" ");
		String longest = words[0];
		for(String word: words) {
			if(word.length()>longest.length())
				longest=word;
		}
		System.out.println("The longest word is " + longest);
		sc.close();
	}
}
