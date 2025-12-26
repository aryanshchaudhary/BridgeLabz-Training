package level_1;
import java.util.*;
public class CopyArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols = sc.nextInt();
		int[][] matrix = new int[rows][cols];
		int[] array = new int[rows*cols];
		for(int i = 0; i<rows; i++)
			for(int j = 0; j<cols; j++)
				matrix[i][j]=sc.nextInt();
		int index=0;
		for(int i=0;i<rows;i++)
			for(int j = 0; j<cols; j++)
				array[index++]=matrix[i][j];
		for (int val:array)
			System.out.print(val + " ");
		sc.close();
	}
}
