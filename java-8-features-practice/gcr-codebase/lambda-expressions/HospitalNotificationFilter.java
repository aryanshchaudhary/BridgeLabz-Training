package lambda_expressions;
import java.util.*;
import java.util.function.Predicate;

public class HospitalNotificationFilter {
    static class Alert {
        String message;
        String type;  

        Alert(String message, String type) {
            this.message = message;
            this.type = type;
        }

        @Override
        public String toString() {
            return type + " Alert: " + message;
        }
    }

    public static void main(String[] args) {

        List<Alert> alerts = new ArrayList<>();
        alerts.add(new Alert("High blood pressure detected", "Emergency"));
        alerts.add(new Alert("Time to take medicine", "Medication"));
        alerts.add(new Alert("Health tips available", "General"));

        Predicate<Alert> emergencyFilter =
                alert -> alert.type.equals("Emergency");

        System.out.println("Filtered Notifications:");
        alerts.stream()
              .filter(emergencyFilter)
              .forEach(System.out::println);
    }
}
