package online_examination_system;
class Question {
	private int questionId;
	private String question;
	private String correctAnswer;
	private boolean isObjective;
	
	public Question(int questionId, String question, String correctAnswer, boolean isObjective) {
		this.questionId = questionId;
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.isObjective = isObjective;
	}
	
	public int getQuestionId() {
		return questionId;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	
	public boolean getIsObjective() {
		return isObjective;
	}
}
