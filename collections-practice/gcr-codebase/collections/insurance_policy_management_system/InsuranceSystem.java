package insurance_policy_management_system;
import java.time.LocalDate;
import java.util.*;

public class InsuranceSystem {
	public static void main(String[] args) {
		 PolicyManager manager = new PolicyManager();

	        Policy p1 = new Policy("P101", "Alice",
	                LocalDate.now().plusDays(20), "Health", 5000);

	        Policy p2 = new Policy("P102", "Bob",
	                LocalDate.now().plusDays(60), "Auto", 4000);

	        Policy p3 = new Policy("P103", "Carol",
	                LocalDate.now().plusDays(10), "Health", 6000);

	        Policy p4 = new Policy("P101", "David",
	                LocalDate.now().plusDays(40), "Home", 7000);

	        manager.addPolicy(p1);
	        manager.addPolicy(p2);
	        manager.addPolicy(p3);

	        System.out.println("\nAll Policies:");
	        manager.displayAllPolicies();

	        System.out.println("\nExpiring Soon:");
	        manager.policiesExpiringSoon();

	        System.out.println("\nHealth Policies:");
	        manager.policiesByCoverage("Health");

	        System.out.println("\nDuplicate Policies:");
	        manager.findDuplicates(List.of(p1, p2, p3, p4));
	}
}
