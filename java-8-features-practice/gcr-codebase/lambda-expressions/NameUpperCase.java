package lambda_expressions;
import java.util.*;
public class NameUpperCase {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Amit", "Neha", "Charlie", "Rahul");

		System.out.println("Names in Uppercase:");
		names.forEach(name -> System.out.println(name.toUpperCase()));
	}
}
