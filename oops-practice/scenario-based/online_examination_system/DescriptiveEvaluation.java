package online_examination_system;

class DescriptiveEvaluation implements EvaluationStrategy {
	public double evaluate(Exam exam, Student student) {
		int score = 0;

		for (int i = 0; i < exam.questionCount; i++) {
			Question q = exam.questions[i];
			if (!q.getIsObjective() && student.answers[i] != null) {
				score++;
			}
		}
		return score;
	}
}
