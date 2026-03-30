package level_2;
import java.util.*;
public class Quadratic {
	static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            return new double[0];
        }
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{ root };
        }
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        return new double[]{ root1, root2 };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quadratic Equation: ax² + bx + c = 0");
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        if (a == 0) {
            System.out.println("Invalid input!");
            return;
        }
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();
        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        }
        else if (roots.length == 1) {
            System.out.printf("The equation has one real root: %.2f\n", roots[0]);
        }
        else {
            System.out.printf("The equation has two real roots:\n");
            System.out.printf("Root 1 = %.2f\n", roots[0]);
            System.out.printf("Root 2 = %.2f\n", roots[1]);
            sc.close();
        }
    }
}
