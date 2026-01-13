package online_examination_system;
class Student {
	private int sId;
	private String sName;
	String[] answers;
	
	public Student(int sId, String sName, int totalQuestions) {
		this.sId = sId;
		this.sName = sName;
		answers = new String[totalQuestions];
	}
	public String getName() {
		return sName;
	}
	
	public void submitAnswer(int questionIndex, String answer) {
		answers[questionIndex] = answer;
	}
}
