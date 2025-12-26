package level_3;
import java.util.*;
public class UniqueCharacters {
	static int findLength(String text) {
		int len=0;
		try {
			while(true) {
				text.charAt(len);
				len++;
			}
		} catch(Exception e) {}
		return len;
	}
	static char[] uniqueCharacters(String text) {
        int len = findLength(text);
        char[] temp = new char[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[count++] = current;
            }
        }
        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the text : ");
		String text = sc.nextLine();
		char[] unique = uniqueCharacters(text);
        System.out.print("Unique Characters: ");
        for (char c : unique) {
            System.out.print(c + " ");
        }
		sc.close();
	}
}
