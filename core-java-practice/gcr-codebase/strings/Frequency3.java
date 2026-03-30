package level_3;
import java.util.*;
public class Frequency3 {
	static String[] frequency(String text) {
        char[] chars = text.toCharArray();
        int len = chars.length;
        int[] freq = new int[len];
        for (int i = 0; i < len; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " -> " + freq[i];
            }
        }
        return result;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the text : ");
		String text = sc.nextLine();
		String[] output = frequency(text);
        System.out.println("\nCharacter Frequency:");
        for (String s : output) {
            System.out.println(s);
        }
		sc.close();
	}
}
