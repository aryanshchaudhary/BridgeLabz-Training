package week_5;
import java.util.*;
public class RelativeRanks_506 {
	public String[] findRelativeRanks(int[] score) {
		int n = score.length;
		String[] result = new String[n];
		
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			arr[i][0] = score[i];
			arr[i][1] = i;
		}
		Arrays.sort(arr, (a, b) -> b[0] - a[0]);
		for(int i = 0; i < n; i++) {
			int index = arr[i][1];
			if(i == 0) {
                result[index] = "Gold Medal";
			} else if (i == 1) {
				result[index] = "Silver Medal";
			} else if (i == 2) {
				result[index] = "Bronze Medal";
			} else {
				result[index] = String.valueOf(i + 1);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		RelativeRanks_506 obj = new RelativeRanks_506();
		int[] score = { 5, 4, 3, 2, 1 };
		String[] result = obj.findRelativeRanks(score);
		System.out.println("Relative Ranks: " + Arrays.toString(result));
	}
}
