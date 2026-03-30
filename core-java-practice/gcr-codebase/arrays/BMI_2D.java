package level_2;
import java.util.*;
public class BMI_2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of persons : ");
		int num = sc.nextInt();
		double[][] personData = new double[num][3];
		String[] Status= new String[num];
		for(int i =0; i<num; i++) {
			System.out.println("Enter the height in Metre " + (i + 1) + ": ");
			double height = sc.nextDouble();
			System.out.println("Enter the weight in KG " + (i + 1) + ": ");
			double weight = sc.nextDouble();
			if (weight<=0 || height<=0) {
				System.out.println("Invalid Input");
				i--;
				continue;
			}
			double BMI = weight/(height*height);
			personData[i][0] = weight;
			personData[i][1] = weight;
			personData[i][2] = weight;
			if (BMI < 18.5)
				Status[i] = "Underweight";
			else if (BMI < 25)
				Status[i] = "Normal";
			else if (BMI < 30)
				Status[i] = "Overweight";
			else
				Status[i] = "Obese";
		}
		System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
		for (int i = 0; i < num; i++) {
		    System.out.printf("%.2f\t%.2f\t%.2f\t%s\n",
		            personData[i][1],
		            personData[i][0],
		            personData[i][2],
		            Status[i]);
		}
		sc.close();
	}
}
