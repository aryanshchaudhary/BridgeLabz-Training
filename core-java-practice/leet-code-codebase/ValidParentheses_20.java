package core_java;
import java.util.*;
public class ValidParentheses_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string of parentheses : ");
		String s = sc.nextLine();
		boolean changed = true;
		while(changed) {
			changed = false;
			if(s.contains("()")){
				s=s.replace("()", "");
				changed = true;
			}
			if(s.contains("{}")) {
				s=s.replace("{}", "");
				changed = true;
			}
			if(s.contains("[]")) {
				s=s.replace("[]", "");
				changed = true;
			}
		}
		System.out.println(s.isEmpty());
		sc.close();
	}
}
