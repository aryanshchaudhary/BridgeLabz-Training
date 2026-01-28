package smart_checkout;
import java.util.LinkedList;
import java.util.Queue;

class CheckoutQueue {
	 Queue<Customer> queue = new LinkedList<>();

	    void addCustomer(Customer customer) {
	        queue.add(customer);
	        System.out.println(customer.name + " joined queue");
	    }

	    Customer nextCustomer() {
	        return queue.poll();
	    }
}
