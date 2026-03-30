package online_examination_system;

class ExamTimeExpiredException extends Exception {
	public ExamTimeExpiredException(String message) {
		super(message);
	}
}
