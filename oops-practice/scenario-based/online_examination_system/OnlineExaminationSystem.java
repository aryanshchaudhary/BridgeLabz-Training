package online_examination_system;

public class OnlineExaminationSystem {
	public static void main(String[] args) {
		try {
			Exam exam = new Exam(1, "Java", 10, 5);
			
			exam.addQuestion(new Question(1, "What is JVM?", "Java Virtual Machine", true));
			exam.addQuestion(new Question(1, "Define OOPs.", "Object Oriented Programming", false));
			
			Student student = new Student(101, "Aryansh", exam.questionCount);
			exam.checkTime();
			
			student.submitAnswer(0, "Java Virtual Machine");
			student.submitAnswer(1, "Object OrientedProgramming");
			
			EvaluationStrategy objEval = new ObjectiveEvaluation();
            EvaluationStrategy descEval = new DescriptiveEvaluation();

            double objScore = objEval.evaluate(exam, student);
            double descScore = descEval.evaluate(exam, student);

            System.out.println("Student Name : " + student.getName());
            System.out.println("Objective Score : " + objScore);
            System.out.println("Descriptive Score : " + descScore);
            System.out.println("Total Score : " + (objScore + descScore));
		} catch(ExamTimeExpiredException e) {
			System.out.println(e.getMessage());
		}
	}
}
