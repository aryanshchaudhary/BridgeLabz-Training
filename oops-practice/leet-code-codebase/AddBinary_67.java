package l_2;
import java.util.*;
public class AddBinary_67 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter binary number 1 as string : ");
		String a = sc.next();
		System.out.print("Enter binary number 2 as string : ");
		String b = sc.next();
		StringBuilder result = new StringBuilder();
		int i = a.length()-1;
		int j = b.length()-1;
		int carry = 0;
		while(i>=0 || j>=0 || carry >0) {
			if(i>=0) {
				carry += a.charAt(i--)-'0';
			}
			if(j>=0) {
				carry += b.charAt(j--)-'0';
			}
			result.append(carry%2);
			carry/=2;
		}
		System.out.println(result.reverse().toString());	
	    sc.close();
	}
}