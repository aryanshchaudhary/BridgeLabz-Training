package week_6;

import java.util.*;

public class ReverseVowelsofaString_345 {
	public String reverseVowels(String s) {
		List<Character> list = new ArrayList<>();
		for (char c : s.toCharArray()) {
			if (isVowel(c)) {
				list.add(c);
			}
		}
		char[] arr = s.toCharArray();
		int idx = list.size() - 1;

		for (int i = 0; i < arr.length; i++) {
			if (isVowel(arr[i])) {
				arr[i] = list.get(idx--);
			}
		}
		return new String(arr);
	}

	private boolean isVowel(char c) {
		return "aeiouAEIOU".indexOf(c) != -1;
	}

	public static void main(String[] args) {
		ReverseVowelsofaString_345 solution = new ReverseVowelsofaString_345();
		String s = "hello";
		System.out.println(solution.reverseVowels(s));

		s = "leetcode";
		System.out.println(solution.reverseVowels(s));
	}
}
