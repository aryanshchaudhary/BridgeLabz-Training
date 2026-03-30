package map_interface;

import java.util.*;

public class MergeMaps {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>(Map.of("A", 1, "B", 2));

		Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

		for (Map.Entry<String, Integer> entry : map2.entrySet()) {
			map1.put(entry.getKey(), map1.getOrDefault(entry.getKey(), 0) + entry.getValue());
		}

		System.out.println(map1);
	}
}
