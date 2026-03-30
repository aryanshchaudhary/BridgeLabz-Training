package exam_proctor;
import java.util.*;
public class ExamProctor {
	Stack<Integer> navigation = new Stack<>();
	HashMap<Integer, String> answers = new HashMap<>();
	
	public void visitQuestion(int questionNumber) {
		navigation.push(questionNumber);
	}
	
	public void answerQuestion(int questionNumber, String answer) {
		answers.put(questionNumber, answer);
	}
	
	public int calculateScore(HashMap<Integer, String> correctAnswers) {
		int score = 0;
		for (int questionNumber : correctAnswers.keySet()) {
			if (answers.containsKey(questionNumber)
					&& answers.get(questionNumber).equals(correctAnswers.get(questionNumber))) {
				score++;
			}
		}
		return score;
	}
}
