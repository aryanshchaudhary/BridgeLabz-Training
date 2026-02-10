package event_feedback_rating_analyzer;
public class EventAnalyzerMain {

    public static void main(String[] args) {

        EventFeedback feedback = new EventFeedback();

        try {
            feedback.addRating("E101", 5);
            feedback.addRating("E101", 4);
            feedback.addRating("E102", 3);
            feedback.addRating("E102", 5);
            feedback.addRating("E103", 2);

            System.out.println("Average for E101: " +
                    feedback.calculateAverage("E101"));

            System.out.println("Top Rated Event: " +
                    feedback.getTopRatedEvent());

        } catch (InvalidRatingException e) {
            System.out.println(e.getMessage());
        }
    }
}
