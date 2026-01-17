package week_3;
import java.util.*;
public class ValidPalindrome_125 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = sc.nextLine();
		String str = s.toLowerCase().replaceAll("[^a-z0-9]","");
		String rev = "";
		for(int i = str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		sc.close();
	}
}
