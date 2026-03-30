package l_2;
import java.util.*;
public class LengthofLastWord_58 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = sc.nextLine();
		String newS = s.trim();
		int count = 0;
		for(int i = newS.length()-1; i>=0;i--) {
			if(newS.charAt(i) != ' ') {
				count++;
			}else {
				break;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
