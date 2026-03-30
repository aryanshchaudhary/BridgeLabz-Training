package stream_API;
import java.util.*;

public class TransformCustomerNames {
	public static void main(String[] args) {
		List<String> customers = Arrays.asList("Rahul", "Anita", "Suresh", "Priya", "Vikram");

		customers.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
	}
}
