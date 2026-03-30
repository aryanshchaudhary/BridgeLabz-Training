package level_2;
import java.util.*;
public class Vote {
	static int[] getAges(int n) {
		int[] ages = new int[n];
		for(int i = 0; i<n;i++) {
			ages[i] = (int)(Math.random()*90);
		}
		return ages;
	}
	static String[][] checkEligibility(int[] ages){
		String[][] result = new String[ages.length][2];
		for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0)
                result[i][1] = "Invalid Age";
            else if (ages[i] >= 18)
                result[i][1] = "Can Vote";
            else
                result[i][1] = "Cannot Vote";
        }
		return result;
	}
	static void display(String[][] data) {
		System.out.println("\nAge\tStatus");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int[] ages = getAges(num);
        display(checkEligibility(ages));
		sc.close();
	}
}
