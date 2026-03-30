package lambda_expressions;
import java.util.*;
public class PateintID {
	public static void main(String[] args) {
		List<Integer> patientIDs = Arrays.asList(101, 202, 303, 404, 505);
		
		System.out.println("Patient IDs:");
		patientIDs.forEach(id -> System.out.println("Patient ID: " + id));
	}
}
