package level_3;
import java.util.*;
public class Matrix {
	static int[][] createMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        Random r = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = r.nextInt(10);
            }
        }
        return mat;
    }
    static int[][] addMatrix(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                sum[i][j] = A[i][j] + B[i][j];

        return sum;
    }
    static int[][] subtractMatrix(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] diff = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                diff[i][j] = A[i][j] - B[i][j];

        return diff;
    }
    static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = B[0].length;
        int common = B.length;

        int[][] product = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return product;
    }
    static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int rows = 3, cols = 3;
        int[][] A = createMatrix(rows, cols);
        int[][] B = createMatrix(rows, cols);
        System.out.println("Matrix A:");
        displayMatrix(A);
        System.out.println("\nMatrix B:");
        displayMatrix(B);
        System.out.println("\nAddition (A + B):");
        displayMatrix(addMatrix(A, B));
        System.out.println("\nSubtraction (A - B):");
        displayMatrix(subtractMatrix(A, B));
        System.out.println("\nMultiplication (A × B):");
        displayMatrix(multiplyMatrix(A, B));
    }
}
