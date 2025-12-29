package level_2;
import java.util.*;
public class Random {
	public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + (int)(Math.random() * 9000);
        }
        return numbers;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        double average = (double) sum / numbers.length;
        return new double[]{ average, min, max };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many 4-digit random numbers to generate: ");
        int size = sc.nextInt();
        int[] numbers = generate4DigitRandomArray(size);
        System.out.println("\nGenerated 4-Digit Random Numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        double[] result = findAverageMinMax(numbers);
        System.out.println("\n\nResults:");
        System.out.printf("Average value : %.2f\n", result[0]);
        System.out.println("Minimum value : " + (int) result[1]);
        System.out.println("Maximum value : " + (int) result[2]);
    }
}
