package set_interface;

import java.util.*;

public class SubsetCheck {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Set.of(2, 3));
		Set<Integer> setB = new HashSet<>(Set.of(1, 2, 3, 4));
		
		boolean isSubset = setB.containsAll(setA);
		System.out.println(isSubset);
	}
}
