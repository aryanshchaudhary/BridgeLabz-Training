package algorithm_runtime_analysis;
import java.util.*;
public class DataStructureCompare {
	public static void main(String[] args) {
		
		int N = 1_000_000;
		int target = N - 1;
		
		// Array
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = i;
		}
		
		// HashSet
		HashSet<Integer> hashSet = new HashSet<>();
		for (int i = 0; i < N; i++) {
			hashSet.add(i);
		}
		
		// TreeSet
		TreeSet<Integer> treeSet = new TreeSet<>();
		for (int i = 0; i < N; i++) {
			treeSet.add(i);
		}
		
		// Array Search
		long startTime1 = System.nanoTime();
		boolean foundInArray = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				foundInArray = true;
				break;
			}
		}
		long endTime1 = System.nanoTime();
		
		// HashSet Search
		long startTime2 = System.nanoTime();
		boolean foundInHashSet = hashSet.contains(target);
		long endTime2 = System.nanoTime();
		
		// TreeSet Search
		long startTime3 = System.nanoTime();
    	boolean foundInTreeSet = treeSet.contains(target);
		long endTime3 = System.nanoTime();
		
		long duration1 = endTime1 - startTime1;
		long duration2 = endTime2 - startTime2;
		long duration3 = endTime3 - startTime3;
		
		System.out.println("Array search time: " + duration1 + " ns");
		System.out.println("HashSet search time: " + duration2 + " ns");
		System.out.println("TreeSet search time: " + duration3 + " ns");
	}
}
