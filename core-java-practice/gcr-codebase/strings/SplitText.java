package level_2;
import java.util.Scanner;
public class SplitText {
	static int findLength(String s1) {
		int l = 0;
		try {
			for(int i=0; ; i++) {
				s1.charAt(i);
				l++;
			}
		} catch(Exception e) {}
		return l;
	}
	static String[] splitText(String text) {
		int len = findLength(text), count = 1;
		for (int i = 0; i < len; i++)
			if (text.charAt(i) == ' ' ) count++;
		String[] words = new String[count];
		int index = 0;
		String temp = "";
		for(int i=0; i<len; i++) {
			if (text.charAt(i)==' ') {
				words[index++]=temp;
				temp="";
			} else temp+= text.charAt(i);
		}
		words[index] = temp;
		return words;
	} 
	static String[][] wordLength(String[] words) {
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }
        return data;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter data :");
		String text = sc.nextLine();
		String[] words = splitText(text);
		String[][] table = wordLength(words);
		System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++)
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
	}
}



    

   

