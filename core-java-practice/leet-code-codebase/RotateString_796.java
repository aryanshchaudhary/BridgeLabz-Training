package core_java;
import java.util.*;
public class RotateString_796 {
	static boolean rotateString(String s, String goal) {
		if(s.length()!=goal.length()) {
			return false;
		}
		String newS = s.concat(s);
		if(newS.contains(goal)) {
            return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string s : ");
		String s = sc.nextLine();
		System.out.println("Enter the string goal : ");
		String goal = sc.nextLine();
		boolean result = rotateString(s,goal);
		System.out.println(result);
		sc.close();
	}
}
