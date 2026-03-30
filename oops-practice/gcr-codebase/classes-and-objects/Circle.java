package level_1;
import java.util.*;
public class Circle {
	double radius;
	void calculate() {
		double area = Math.PI*radius*radius;
		double circumference = 2*Math.PI*radius;
		System.out.printf("Area of circle: %.4f\n", area);
		System.out.printf("Circumference of circle: %.4f\n", circumference);
	}
	public static void main(String[] args) {
		Circle cr = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius : ");
		double r = sc.nextDouble();
		cr.radius=r;
		cr.calculate();
		sc.close();
	}
}
