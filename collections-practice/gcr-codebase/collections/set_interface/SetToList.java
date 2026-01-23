package set_interface;

import java.util.*;

public class SetToList {
	public static void main(String[] args) {
		Set<Integer> numberSet = new HashSet<>(Set.of(5, 3, 9 ,1));
		
		List<Integer> numberList = new ArrayList<>(numberSet);
		Collections.sort(numberList);
		
		System.out.println("List: " + numberList);
	}
}
