package algorithm_runtime_analysis;
import java.util.Arrays;
public class SearchComparison {
	
	// Linear Search Method
	public static int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1; 
	}
	
	// Binary Search Method
	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int N = 1_000_000;
		int target = N - 1;
		
		int[] data = new int[N];
		
		for (int i = 0; i < N; i++) {
			data[i] = i;
		}
		
		// Linear Search Timing
		long startTime1 = System.nanoTime();
		linearSearch(data, target);
		long endTime1 = System.nanoTime();
		long duration1 = endTime1 - startTime1;
		
		// Binary Search Timing
		Arrays.sort(data);
		
		long startTime2 = System.nanoTime();
		binarySearch(data, target);
		long endTime2 = System.nanoTime();
		long duration2 = endTime2 - startTime2;
		
		System.out.println("Linear Search time: " + duration1 + " ns");
		System.out.println("Binary Search time: " + duration2 + " ns");
	}
}
