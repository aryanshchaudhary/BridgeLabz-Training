package lexical_twist;
import java.util.*;
public class LexicalTwist {
	public static boolean isValidWord(String word) {
		return !word.contains(" ");
	}
	public static boolean isReverse(String word1, String word2) {
		if(word1.length() != word2.length()) {
			return false;
		}
		String rev = new StringBuilder(word2).reverse().toString();
		return word1.equalsIgnoreCase(rev);
	}
	static String replaceAllVowels(String word) {
		String result = "";
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				ch = '@';
			}
			result += ch;
		}
		return result;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first word: ");
		String str1 = sc.nextLine();
		if(!isValidWord(str1)) {
			System.out.println(str1 + " is an invalid word");
			return;
		}
		System.out.println("Enter the second word: ");
		String str2 = sc.nextLine();
		if(!isValidWord(str2)) {
			System.out.println(str2 + " is an invalid word");
			return;
		}
		if (isReverse(str1, str2)) {
			String revStr1 = new StringBuilder(str1).reverse().toString();
			String lowerRevStr1 = revStr1.toLowerCase();
			System.out.println(replaceAllVowels(lowerRevStr1));
		} else{
			String combined = str1 + str2;
			String upperCombined = combined.toUpperCase();
			int countVowel = 0;
			int countConso = 0;
			for(int i = 0; i <upperCombined.length(); i++) {
				char ch = upperCombined.charAt(i);
				if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					countVowel++;
				}else {
					countConso++;
				}
			}
			String result = "";
			if(countVowel > countConso) {
				for(int i = 0; i < upperCombined.length(); i++) {
					char ch = upperCombined.charAt(i);
					if("AEIOU".indexOf(ch) != -1 && result.indexOf(ch) == -1) {
						result += ch;
					}
					if(result.length() == 2) {
						break;
					}
				}
				System.out.println(result);
			}else if(countVowel < countConso) {
				for(int i = 0; i < upperCombined.length(); i++) {
					char ch = upperCombined.charAt(i);
					if(Character.isLetter(ch) && "AEIOU".indexOf(ch) == -1 && result.indexOf(ch) == -1) {
						result += ch;
					}
					if(result.length() == 2) {
						break;
					}
				}
				System.out.println(result);
			}else {
				System.out.println("Vowels and consonants are equal");
			}
		}
		sc.close();
	}
}
