package collectors;
import java.util.*;
import java.util.stream.*;

class Order {
    String customer;
    double amount;

    Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }
}
public class OrderRevenue {
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
                new Order("Aman", 200),
                new Order("Riya", 300),
                new Order("Aman", 150)
        );
		Map<String, Double> revenue = 
				orders.stream().collect(Collectors.groupingBy(
						o -> o.customer, Collectors.summingDouble(o -> o.amount)));
		System.out.println(revenue);
	}
}
