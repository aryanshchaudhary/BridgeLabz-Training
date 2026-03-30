package core_java;
import java.util.*;
public class ValidAnagram_242 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String a = sc.next();
		System.out.print("Enter the second string: ");
		String b = sc.next();
		if(a.length()!=b.length()) {
			System.out.println("false");
		}
		char[] s = a.toCharArray();
		char[] t = b.toCharArray();
		
		Arrays.sort(s);
		Arrays.sort(t);
		
		if(Arrays.equals(s, t)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}	
		sc.close();
	}
}
