package level_2;
import java.util.*;
public class VowelConsonant2 {
	static String charCheck(char ch) {
		if (ch>='A' && ch<= 'Z') {
			ch = (char)(ch+32);
		}
		if (ch>='a' && ch<='z') {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				return "Vowel";
			else
				return "Consonant";
		}else
			return "Not a letter";
	}
	static String[][] analyzeString(String text){
		String[][] result = new String[text.length()][2];
		for (int i = 0; i<text.length(); i++) {
				result[i][0] = String.valueOf(text.charAt(i));
	            result[i][1] = charCheck(text.charAt(i));	
		}
		return result;
	}
	static void display(String[][] text) {
		System.out.println("\nChar\tType");
        for (String[] row : text) {
            System.out.println(row[0] + "\t" + row[1]);
        }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the text : ");
		String text = sc.nextLine();
		String[][] output = analyzeString(text);
        display(output);
		sc.close();
	}
}
