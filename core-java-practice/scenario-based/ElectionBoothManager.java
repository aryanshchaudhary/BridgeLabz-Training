package scenario_based;
import java.util.*;
public class ElectionBoothManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 while (true) {
	            System.out.print("Enter voter age (or -1 to exit): ");
	            int age = sc.nextInt();

	            if (age == -1) {
	                System.out.println("Exited from Booth.");
	                break; // for exiting the loop
	            }

	            if (age < 18) {
	                System.out.println("Not eligible to vote.");
	            } else {
	                System.out.println("Eligible to vote.");
	                System.out.print("Enter your vote (1, 2, or 3): ");
	                int vote = sc.nextInt();
	                // recoding votes for three candidates
	                if (vote == 1)
	                    System.out.println("Vote recorded for Candidate A");
	                else if (vote == 2)
	                    System.out.println("Vote recorded for Candidate B");
	                else if (vote == 3)
	                    System.out.println("Vote recorded for Candidate C");
	                else
	                    System.out.println("Invalid vote!");
	            }
	        }
	
		sc.close();
	}
}
