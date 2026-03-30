package level_3;
import java.util.*;
public class Marks {
	static int[][] generateScores(int n) {
        int[][] scores = new int[n][3]; 
        for (int i = 0; i < n; i++) {
            scores[i][0] = 10 + (int)(Math.random() * 90);
            scores[i][1] = 10 + (int)(Math.random() * 90); 
            scores[i][2] = 10 + (int)(Math.random() * 90); 
        }
        return scores;
    }
    static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;
            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = percent;
        }
        return result;
    }
    static void displayScorecard(int[][] scores, double[][] result) {
        System.out.println("Stu\tPhysics\tChem\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    (int)result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] result = calculateResults(scores);
        displayScorecard(scores, result);
    }
}
