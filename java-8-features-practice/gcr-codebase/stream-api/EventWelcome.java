package stream_API;
import java.util.*;
public class EventWelcome {
	public static void main(String[] args) {
		List<String> attendees = Arrays.asList("Rahul", "Anita", "Suresh", "Priya", "Vikram");

		attendees.stream().map(name -> "Welcome " + name + "!").forEach(System.out::println);
	}
}
