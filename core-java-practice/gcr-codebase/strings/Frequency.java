package level_3;
import java.util.*;
public class Frequency {
	static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                count++;
            }
        }
        String[][] result = new String[count][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }
        return result;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the text : ");
		String text = sc.nextLine();
		String[][] data = findFrequency(text);
        System.out.println("\nCharacter\tFrequency");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
		sc.close();
	}
}
