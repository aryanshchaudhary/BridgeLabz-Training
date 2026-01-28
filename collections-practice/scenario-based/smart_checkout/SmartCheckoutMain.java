package smart_checkout;
import java.util.List;

class SmartCheckoutMain {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
        inventory.addItem("Milk", 50, 10);
        inventory.addItem("Bread", 40, 5);

        CheckoutQueue checkout = new CheckoutQueue();

        checkout.addCustomer(new Customer("Aman", List.of("Milk", "Bread")));
        checkout.addCustomer(new Customer("Riya", List.of("Milk")));

        processBilling(checkout, inventory);
        processBilling(checkout, inventory);
    }

    static void processBilling(CheckoutQueue checkout, Inventory inventory) {

        Customer customer = checkout.nextCustomer();
        if (customer == null) return;

        int total = 0;
        System.out.println("Billing " + customer.name);

        for (String item : customer.items) {
            if (inventory.isAvailable(item)) {
                total += inventory.getPrice(item);
                inventory.reduceStock(item);
            } else {
                System.out.println(item + " out of stock");
            }
        }

        System.out.println("Total Bill: ₹" + total);
	}
}
