package level_2;
import java.util.*;
public class YoungestTallest {
	static int youngest(int[] age) {
		int min =age[0];
		for(int a:age) if(a<min)min=a;
		return min;
	}
	static double tallest(double[] height) {
		double max = height[0];
		for(double h:height) if(h>max) max=h;
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] age = new int[3];
		double[] height = new double[3];
		for(int i=0;i<3;i++) {
			System.out.print("Enter the age : ");
			age[i] = sc.nextInt();
			System.out.print("Enter the height : ");
			height[i] = sc.nextDouble();
		}
		System.out.println("Youngest Age: " + youngest(age));
		System.out.println("Youngest Age: " + tallest(height));
		sc.close();
	}
}
