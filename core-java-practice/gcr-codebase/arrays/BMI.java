package level_2;

import java.util.*;

public class BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of persons : ");
		int num = sc.nextInt();
		double[] weight = new double[num];
		double[] height = new double[num];
		double[] BMI = new double[num];
		String[] Status = new String[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the height in Metre " + (i + 1) + ": ");
			height[i] = sc.nextDouble();
			System.out.println("Enter the weight in KG " + (i + 1) + ": ");
			weight[i] = sc.nextDouble();
			BMI[i] = weight[i] / (height[i] * height[i]);
			if (BMI[i] < 18.5)
				Status[i] = "Underweight";
			else if (BMI[i] < 25)
				Status[i] = "Normal";
			else if (BMI[i] < 30)
				Status[i] = "Overweight";
			else
				Status[i] = "Obese";
		}
		for(int i =0; i<num;i++)
			System.out.println(height[i] + " " + weight[i] + " " + BMI[i] + " " + Status[i]);
		sc.close();
	}
}
