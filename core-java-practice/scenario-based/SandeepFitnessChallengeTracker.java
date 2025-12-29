package scenario_based;
import java.util.*;
public class SandeepFitnessChallengeTracker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] pushUps = new int[7];
		for (int i = 0; i < pushUps.length; i++) {
            System.out.print("Enter push-ups for day " + (i + 1) + ": ");
            pushUps[i] = sc.nextInt();
        }
        int total = 0;
        int activeDays = 0;
        // Calculating total and average 
        for (int count : pushUps) {
            if (count == 0) {
                continue; // skip rest day
            }
            total += count;
            activeDays++;
        }
        double average = (activeDays > 0) ? (double) total / activeDays : 0;

        System.out.println("\nTotal Push-ups (without rest days): " + total);
        System.out.println("Average Push-ups per active day: " + average);
		sc.close();
	}
}
