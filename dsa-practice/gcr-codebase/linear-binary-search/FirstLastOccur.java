package linear_binary_search;

public class FirstLastOccur {
	public static int findFirst(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int first = -1;
		
		while(left <= right) {
			int mid = left + (right - left) / 2;
			
			if(arr[mid] == target) {
				first = mid;
				right = mid - 1;
			}else if(arr[mid] < target) {
                left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return first;
	}
	
	public static int findLast(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int last = -1;
		
		while(left <= right) {
			int mid = left + (right - left) / 2;
			
			if(arr[mid] == target) {
				last = mid;
				left = mid + 1;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return last;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,2,2,3,4,5};
		int target = 2;
		
		int firstIndex = findFirst(arr, target);
		int lastIndex = findLast(arr, target);
		
		if(firstIndex == -1) {
			System.out.println(-1);
		} else {
			System.out.println("First Occurrence: " + firstIndex);
			System.out.println("Last Occurrence : " + lastIndex);
		}
	}
}
