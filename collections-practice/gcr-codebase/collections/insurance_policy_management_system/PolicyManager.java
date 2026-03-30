package insurance_policy_management_system;
import java.time.LocalDate;
import java.util.*;

public class PolicyManager {
	 Set<Policy> hashSet = new HashSet<>();           
	    Set<Policy> linkedHashSet = new LinkedHashSet<>(); 
	    Set<Policy> treeSet = new TreeSet<>();       

	    void addPolicy(Policy p) {
	        hashSet.add(p);
	        linkedHashSet.add(p);
	        treeSet.add(p);
	    }

	    void displayAllPolicies() {
	        hashSet.forEach(System.out::println);
	    }

	    void policiesExpiringSoon() {
	        LocalDate today = LocalDate.now();
	        LocalDate limit = today.plusDays(30);

	        for (Policy p : treeSet) {
	            if (!p.expiryDate.isAfter(limit)) {
	                System.out.println(p);
	            }
	        }
	    }

	    void policiesByCoverage(String type) {
	        for (Policy p : hashSet) {
	            if (p.coverageType.equalsIgnoreCase(type)) {
	                System.out.println(p);
	            }
	        }
	    }

	    void findDuplicates(List<Policy> policies) {
	        Set<String> seen = new HashSet<>();
	        for (Policy p : policies) {
	            if (!seen.add(p.policyNumber)) {
	                System.out.println("Duplicate Found: " + p);
	            }
	        }
	    }
}
