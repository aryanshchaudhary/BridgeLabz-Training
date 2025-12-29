package level_1;
import java.util.*;
public class Trigonometry {
	static double[] trigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        return new double[]{
            Math.sin(rad),
            Math.cos(rad),
            Math.tan(rad)
        };
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the angle in degree : ");
		double angle = sc.nextDouble();
		double[] result = trigonometricFunctions(angle);
		System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);
		sc.close();
	}
}
