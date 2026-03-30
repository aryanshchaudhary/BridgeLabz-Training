package list_interface;

import java.util.*;

public class FrequencyCounter {
	public static void main(String[] args) {
		List<String> list = List.of("apple", "banana", "apple", "orange", "banana", "apple");
		Map<String, Integer> frequencyMap = new HashMap<>();

		for (String item : list) {
			frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
		}

		System.out.println("Frequency Count: " + frequencyMap);
	}
}
