package string_extras;
import java.util.*;
public class Replace {
	static String replace(String sentence, String oldWord, String newWord) {
		String[] words = sentence.split(" ");
		String result = "";
		for(String word: words) {
			if(word.equals(oldWord))
				result+=newWord + " ";
			else
				result+=word + " ";
		}
		return result.trim();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence : ");
		String sen = sc.nextLine();
		System.out.println("Enter the old word : ");
		String oldWord = sc.next();
		System.out.println("Enter the new word : ");
		String newWord = sc.next();
		System.out.println(replace(sen,oldWord,newWord));
		sc.close();
	}
}
