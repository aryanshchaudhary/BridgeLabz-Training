package level_1;

import java.util.*;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		if (num <= 0) {
			System.out.println("Please enter a Natural Number");
			return;
		}
		int[] odd = new int[num / 2 + 1];
		int[] even = new int[num / 2 + 1];
		int O = 0;
		int E = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0)
				even[E++] = i;
			else
				odd[O++] = i;
		}
		System.out.println("Odd Numbers:");
		for (int i = 0; i < O; i++)
			System.out.print(odd[i] + " ");

		System.out.println("\nEven Numbers:");
		for (int i = 0; i < E; i++)
			System.out.print(even[i] + " ");
		sc.close();
	}
}
