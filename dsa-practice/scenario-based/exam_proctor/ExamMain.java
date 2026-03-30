package exam_proctor;
import java.util.HashMap;
public class ExamMain {
	public static void main(String[] args) {
		ExamProctor exam = new ExamProctor();
		
		exam.visitQuestion(1);
		exam.answerQuestion(1, "A");
		
		exam.visitQuestion(2);
		exam.answerQuestion(2, "C");
		
		HashMap<Integer, String> correctAnswers = new HashMap<>();
		correctAnswers.put(1, "A");
		correctAnswers.put(2, "B");
		
		int score = exam.calculateScore(correctAnswers);
		System.out.println("Total Score: " + score);
	}
}
