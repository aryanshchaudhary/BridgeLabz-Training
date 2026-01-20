package algorithm_runtime_analysis;

import java.util.Random;

public class SortingComparison {

	// Bubble Sort Method
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	// Merge Sort Method
	public static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	public static void merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int[] L = new int[n1];
		int[] R = new int[n2];

		for (int i = 0; i < n1; i++)
			L[i] = arr[left + i];

		for (int j = 0; j < n2; j++)
			R[j] = arr[mid + 1 + j];

		int i = 0, j = 0;
		int k = left;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Quick Sort Method
	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}

	public static void main(String[] args) {
		int N = 10_000;
		Random rand = new Random();

		int[] data1 = new int[N];
		int[] data2 = new int[N];
		int[] data3 = new int[N];

		for (int i = 0; i < N; i++) {
			int val = rand.nextInt(100_000);
			data1[i] = val;
			data2[i] = val;
			data3[i] = val;
		}

		// Bubble Sort Timing
		if (N <= 10_000) {
			long startTime1 = System.nanoTime();
			bubbleSort(data1);
			long endTime1 = System.nanoTime();
			long duration1 = endTime1 - startTime1;
			System.out.println("Bubble Sort time: " + duration1 + " ns");
		} else {
			System.out.println("Bubble Sort skipped");
		}

		// Merge Sort Timing
		long startTime2 = System.nanoTime();
		mergeSort(data2, 0, data2.length - 1);
		long endTime2 = System.nanoTime();
		long duration2 = endTime2 - startTime2;
		System.out.println("Merge Sort time: " + duration2 + " ns");

		// Quick Sort Timing
		long startTime3 = System.nanoTime();
		quickSort(data3, 0, data3.length - 1);
		long endTime3 = System.nanoTime();
		long duration3 = endTime3 - startTime3;
		System.out.println("Quick Sort time: " + duration3 + " ns");
	}
}
