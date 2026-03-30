package l_2;
import java.util.*;
public class FirstOccurrence28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the heystack : ");
		String heystack = sc.next();
		System.out.print("Enter the needle : ");
		String needle = sc.next();
		int index = -1;
		for(int i=0; i<heystack.length()-needle.length()+1;i++) {
			if(heystack.charAt(i)==needle.charAt(0)) {
				if(heystack.substring(i,i+needle.length()).equals(needle)) {
					index=i;
					break;
				}
			}
		}
		System.out.println(index);
		sc.close();
	}
}
