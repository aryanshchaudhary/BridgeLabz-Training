package string_extras;
import java.util.*;
public class MostFrequent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = sc.nextLine();
		int max=0;
		char result=s.charAt(0);
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j =0; j<s.length();j++) {
				if(s.charAt(i)==s.codePointAt(j))
						count++;
			}
			if(count>max) {
				max=count;
				result=s.charAt(i);
			}
		}
		System.out.println("Most frequent Charcter: " + result);
		sc.close();
	}
}
