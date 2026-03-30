package level_3;
import java.util.*;
public class Matrix2 {
	static double[][] createMatrix(int n) {
        double[][] mat = new double[n][n];
        Random r = new Random();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = r.nextInt(9) + 1;

        return mat;
    }
    static void display(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row) {
                System.out.printf("%6.2f ", val);
            }
            System.out.println();
        }
    }
    static double[][] transpose(double[][] mat) {
        int n = mat.length;
        double[][] t = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                t[j][i] = mat[i][j];
        return t;
    }
    static double determinant2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }
    static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }
    static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0)
            return null;
        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;

        return inv;
    }
    static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0)
            return null;
        double[][] inv = new double[3][3];
        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = (m[0][2]*m[2][1] - m[0][1]*m[2][2]) / det;
        inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = (m[1][2]*m[2][0] - m[1][0]*m[2][2]) / det;
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = (m[0][2]*m[1][0] - m[0][0]*m[1][2]) / det;

        inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = (m[0][1]*m[2][0] - m[0][0]*m[2][1]) / det;
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }
    public static void main(String[] args) {
        System.out.println("2x2 Matrix:");
        double[][] m2 = createMatrix(2);
        display(m2);
        System.out.println("Transpose:");
        display(transpose(m2));
        System.out.println("Determinant: " + determinant2x2(m2));
        System.out.println("Inverse:");
        double[][] inv2 = inverse2x2(m2);
        if (inv2 != null)
            display(inv2);
        else
            System.out.println("Inverse not possible");
        System.out.println("\n3x3 Matrix:");
        double[][] m3 = createMatrix(3);
        display(m3);
        System.out.println("Transpose:");
        display(transpose(m3));
        System.out.println("Determinant: " + determinant3x3(m3));
        System.out.println("Inverse:");
        double[][] inv3 = inverse3x3(m3);
        if (inv3 != null)
            display(inv3);
        else
            System.out.println("Inverse not possible");
    }
}
