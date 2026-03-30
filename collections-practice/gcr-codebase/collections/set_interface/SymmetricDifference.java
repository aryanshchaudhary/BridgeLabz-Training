package set_interface;

import java.util.*;

public class SymmetricDifference {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Set.of(1, 2, 3));
		Set<Integer> setB = new HashSet<>(Set.of(3, 4, 5));
		
		Set<Integer> union = new HashSet<>(setA);
		union.addAll(setB);
		
		Set<Integer> intersection = new HashSet<>(setA);
		intersection.retainAll(setB);
		
		union.removeAll(intersection);
		
		System.out.println("Symmetric Difference: " + union);
	}
}
