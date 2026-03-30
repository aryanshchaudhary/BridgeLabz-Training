package linear_binary_search;

public class FirstNegativeNumber {
	public static int findFirstNegative(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                return i;
            }
        }
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {3,5,10,0,-1,4,-5};
		int result = findFirstNegative(arr);
		
		System.out.println("Index of first negative number: " + result);
	}
}
