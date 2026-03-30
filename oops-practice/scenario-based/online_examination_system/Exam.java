package online_examination_system;

public class Exam {
	int examId;
	String subject;
	Question[] questions;
	int questionCount = 0;
	long endTime;
	
	public Exam(int examId, String subject, int totalQuestions, long durationInMillis) {
		this.examId = examId;
		this.subject = subject;
		this.questions = new Question[totalQuestions];
		this.endTime = System.currentTimeMillis() + durationInMillis;
	}

	void addQuestion(Question question) {
		if (questionCount < questions.length) {
			questions[questionCount++] = question;
		}
	}
	void checkTime() throws ExamTimeExpiredException{
		if (System.currentTimeMillis() > endTime) {
			throw new ExamTimeExpiredException("Time's Up.");
		}
	}
}
