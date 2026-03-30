package event_feedback_rating_analyzer;

@SuppressWarnings("serial")
class InvalidRatingException extends Exception {
    public InvalidRatingException(String message) {
        super(message);
    }
}
