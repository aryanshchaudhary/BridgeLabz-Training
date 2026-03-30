package week_3;

import java.util.*;
import java.util.HashMap;

public class IsomorphicStrings_205 {
	public static boolean isIsomorphic(String s, String t) {
		Map<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				if (!map.get(s.charAt(i)).equals(t.charAt(i))) {
					return false;
				}
			} else {
				if (map.containsValue(t.charAt(i))) {
					return false;
				}
				map.put(s.charAt(i), t.charAt(i));
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String s = sc.nextLine();
		System.out.print("Enter second string: ");
		String t = sc.nextLine();
		System.out.println(isIsomorphic(s, t));
		sc.close();
	}
}
