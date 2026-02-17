package online_hackathon_submission_evaluator;

@SuppressWarnings("serial")
public class LateSubmissionException extends Exception {
    public LateSubmissionException(String message) {
        super(message);
    }
}
