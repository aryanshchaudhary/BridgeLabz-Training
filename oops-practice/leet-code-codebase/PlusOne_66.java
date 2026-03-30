package l_2;

import java.util.Arrays;

public class PlusOne_66 {
	public static void main(String[] args) {
		int[] numbers = {9};
		for(int i = numbers.length-1; i>=0; i--) {
			if(numbers[i]<9) {
				numbers[i]++;
				System.out.println(Arrays.toString(numbers));
				return;
			}
			numbers[i] = 0;
		}
		int[] newNum = new int[numbers.length+1];
		newNum[0] = 1;
		System.out.println(Arrays.toString(newNum));
	}
}
