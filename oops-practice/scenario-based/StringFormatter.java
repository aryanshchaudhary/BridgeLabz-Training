package week_2;
import java.util.*;
public class StringFormatter {
	public static String formatParagraph(String text) {
		if(text == null || text.trim().isEmpty()) {
			return "";
		}
		text = text.trim().replaceAll("\\s+", " ");
		text = text.replaceAll("\\s*([.!?])\\s*", "$1");
		String result ="";
		boolean capitalizeNext = true;
		for(int i =0; i<text.length(); i++) {
			char ch = text.charAt(i);
			if(capitalizeNext && Character.isLetter(ch)){
				result += Character.toUpperCase(ch);
				capitalizeNext = false;
			}else {
				result += ch;
			}
			if (ch == '.' || ch == '!' || ch == '?') {
				capitalizeNext = true;
			}
		}
		return result.trim();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the paragraph: ");
		String para = sc.nextLine();
		System.out.println(formatParagraph(para));
		sc.close();
	}
}
