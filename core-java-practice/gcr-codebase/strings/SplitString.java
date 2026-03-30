package level_2;
import java.util.Scanner;
public class SplitString {
	static int stringLength(String s1) {
        int length = 0;
        try {
            for (int i = 0; ; i++) {
                s1.charAt(i);
                length++;
            }
        } catch (Exception e) {}
        return length;
	}
	static String[] stringSplit(String text) {
        int len = stringLength(text);
        int words = 1;

        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ') words++;

        int[] spaceIndex = new int[words + 1];
        spaceIndex[0] = -1;

        int idx = 1;
        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ') spaceIndex[idx++] = i;

        spaceIndex[idx] = len;

        String[] result = new String[words];
        for (int i = 0; i < words; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++)
                word += text.charAt(j);
            result[i] = word;
        }
        return result;
	}
    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i]))
                return false;

        return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		String str = sc.nextLine();
		String[] myMethod = stringSplit(str);
        String[] systemMethod = str.split(" ");
        boolean equals = compareArrays(myMethod, systemMethod);
        System.out.print("My Result: ");
        for (String s : myMethod)
            System.out.print(s + " ");
        System.out.print("\nSystem Result: ");
        for (String s : systemMethod)
            System.out.print(s + " ");
        System.out.println("\nFinal Comparison: " + equals);
        sc.close();
	}
}





