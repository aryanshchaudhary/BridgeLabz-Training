package week_5;
import java.util.*;
public class AssignCookies_455 {
	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		
		int i = 0, j = 0;
		while(i < g.length && j < s.length) {
			if(s[j] >= g[i]) {
				i++;
				j++;
			}else {
				j++;
			}
		}
		return i;
	}
	public static void main(String[] args) {
		AssignCookies_455 obj = new AssignCookies_455();
		int[] g = {1,2,3};
		int[] s = {1,1};
		int result = obj.findContentChildren(g, s);
		System.out.println("Number of content children: " + result);
	}
}
