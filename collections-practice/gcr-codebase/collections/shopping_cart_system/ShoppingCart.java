package shopping_cart_system;
import java.util.*;

public class ShoppingCart {
	private HashMap<String, Double> priceMap;

    private LinkedHashMap<String, Integer> cartOrder;

    public ShoppingCart() {
        priceMap = new HashMap<>();
        cartOrder = new LinkedHashMap<>();
    }

    public void addProduct(String product, double price) {
        priceMap.put(product, price);
    }

    public void addToCart(String product, int quantity) {
        if (!priceMap.containsKey(product)) {
            System.out.println("Product not found: " + product);
            return;
        }
        cartOrder.put(product, cartOrder.getOrDefault(product, 0) + quantity);
    }

    public void displayCartOrder() {
        System.out.println("\nCart Items (Insertion Order):");
        for (Map.Entry<String, Integer> e : cartOrder.entrySet()) {
            System.out.println(
                e.getKey() + " | Qty: " + e.getValue() +
                " | Price: ₹" + priceMap.get(e.getKey())
            );
        }
    }

    public void displaySortedByPrice() {

        TreeMap<Double, List<String>> sortedByPrice = new TreeMap<>();

        for (String product : cartOrder.keySet()) {
            double price = priceMap.get(product);
            sortedByPrice
                .computeIfAbsent(price, k -> new ArrayList<>())
                .add(product);
        }

        System.out.println("\nCart Items (Sorted by Price):");
        for (Map.Entry<Double, List<String>> e : sortedByPrice.entrySet()) {
            for (String product : e.getValue()) {
                System.out.println(
                    product + " | Price: ₹" + e.getKey() +
                    " | Qty: " + cartOrder.get(product)
                );
            }
        }
    }

    public void displayTotalBill() {
        double total = 0;
        for (Map.Entry<String, Integer> e : cartOrder.entrySet()) {
            total += priceMap.get(e.getKey()) * e.getValue();
        }
        System.out.println("\nTotal Bill: ₹" + total);
    }
}
