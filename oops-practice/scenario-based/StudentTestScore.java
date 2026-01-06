package week_2;
import java.util.*;
public class StudentTestScore {
	static float[] storeStudentScores(int n) {
		Scanner sc = new Scanner(System.in);
		float[] scores = new float[n];
		for (int i = 0; i < n; i++) {
			while (true) {
				try {
					System.out.print("enter student " + (i + 1) + " score: ");
					float score = sc.nextFloat();
					if (score <= 100 && score >= 0) {
						scores[i] = score;
						break;
					} else {
						System.out.println("enter valid score(0-100).");
					}
				} catch (Exception e) {
					System.out.println("invalid input");
					sc.nextLine();
				}
			}
		}
		return scores;
	}
	static float getAverageScore(float[] scores) {
		float sum = 0;
		for (float score : scores) {
			sum += score;
		}
		float avgScore = Math.round(sum / scores.length);
		System.out.println("\n" + "Average score of students: " + avgScore);
		return avgScore;
	}
	static void getHighestAndLowestScores(float[] scores) {
		float highestScore = 0;
		float lowestScore = scores[0];
		for (int i = 0; i < scores.length; i++) {
			if (highestScore < scores[i])
				highestScore = scores[i];
			if (scores[i] < lowestScore)
				lowestScore = scores[i];
		}
		System.out.println("\n" + "Highest Score: " + highestScore);
		System.out.println("Lowest Score: " + lowestScore);
	}
	static void displayScores(float[] scores) {
		System.out.println();
		for (int i = 0; i < scores.length; i++) {
			System.out.println("student " + (i + 1) + " score: " + scores[i]);
		}
		System.out.println();
	}
	static void getScoresAboveAverage(float[] scores) {
		float avgScore = getAverageScore(scores);
		System.out.println("\n" + "scores above average score:");
		for (float score : scores) {
			if (avgScore < score) {
				System.out.println(score);
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = sc.nextInt();
		float[] scores = storeStudentScores(n);
		displayScores(scores);
		getAverageScore(scores);
		getHighestAndLowestScores(scores);
		getScoresAboveAverage(scores);
		sc.close();
	}
}
