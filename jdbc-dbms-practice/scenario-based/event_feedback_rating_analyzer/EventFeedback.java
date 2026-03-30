package event_feedback_rating_analyzer;
import java.util.*;

class EventFeedback {

    private Map<String, List<Integer>> feedbackMap = new HashMap<>();

    public void addRating(String eventId, int rating) throws InvalidRatingException {

        if (rating < 1 || rating > 5) {
            throw new InvalidRatingException("Rating must be between 1 and 5.");
        }

        feedbackMap.putIfAbsent(eventId, new ArrayList<>());
        feedbackMap.get(eventId).add(rating);
    }

    public double calculateAverage(String eventId) {

        List<Integer> ratings = feedbackMap.get(eventId);

        if (ratings == null || ratings.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int r : ratings) {
            sum += r;
        }

        return (double) sum / ratings.size();
    }

    public String getTopRatedEvent() {

        String topEvent = null;
        double highestAvg = 0;

        for (String eventId : feedbackMap.keySet()) {

            double avg = calculateAverage(eventId);

            if (avg > highestAvg) {
                highestAvg = avg;
                topEvent = eventId;
            }
        }

        return topEvent + " | Average Rating: " + highestAvg;
    }
}
