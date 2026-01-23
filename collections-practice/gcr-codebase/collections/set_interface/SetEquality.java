package set_interface;

import java.util.*;

public class SetEquality {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Set.of(1, 2, 3));
		Set<Integer> setB = new HashSet<>(Set.of(3, 2, 1));
		
		boolean areEqual = setA.equals(setB);
		
		System.out.println(areEqual);
	}
}
