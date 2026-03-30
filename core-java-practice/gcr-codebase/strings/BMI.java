package level_3;
import java.util.*;
public class BMI {
	static String[][] calcBMI(double[][] data){
		String[][] result = new String[10][4];
		for(int i=0;i<10;i++) {
			double weight=data[i][0];
			double heightCM=data[i][1];
			double heightM=heightCM/100;
			double BMI = weight/(heightM*heightM);
			String status;
			if (BMI < 18.5)
                status = "Underweight";
            else if (BMI < 25)
                status = "Normal";
            else if (BMI < 30)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.format("%.2f", heightCM);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = String.format("%.2f", BMI);
            result[i][3] = status;
		}
		return result;
	}
	static void display(String[][] result) {
		System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
		for(int i=0; i<10;i++) {
			System.out.println(
					result[i][0] + "\t\t" +
					result[i][1] + "\t\t" +
					result[i][2] + "\t\t" +
					result[i][3] 
			);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }
        String[][] result = calcBMI(data);
        display(result);
        sc.close();
	}
}
