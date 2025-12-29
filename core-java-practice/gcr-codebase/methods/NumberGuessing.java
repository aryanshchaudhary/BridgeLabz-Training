package level_2;
import java.util.*;
import java.util.Random;
public class NumberGuessing {
	static int generateGuess(int low, int high) {
		Random r = new Random();
		return r.nextInt(high - low + 1) + low;
	}
	static String getFeedback(Scanner sc) {
		System.out.print("Enter feedback (high / low / correct): ");
		return sc.next();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int low = 1, high = 100;
		String feedback;
		int guess;
		System.out.println("Think of a number between 1 and 100");
		System.out.println("Hit enter to start the game");
		sc.nextLine();
		while (true) {
			guess = generateGuess(low, high);
			System.out.println("Computer guess: " + guess);
			feedback = getFeedback(sc);
			if (feedback.equalsIgnoreCase("correct")) {
				System.out.println("Computer guessed correctly!");
				break;
			} else if (feedback.equalsIgnoreCase("high")) {
				high = guess - 1;
			} else if (feedback.equalsIgnoreCase("low")) {
				low = guess + 1;
			}
		}
		sc.close();
	}
}
