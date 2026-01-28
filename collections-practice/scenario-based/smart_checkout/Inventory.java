package smart_checkout;
import java.util.HashMap;

class Inventory {
	HashMap<String, Integer> priceMap = new HashMap<>();
    HashMap<String, Integer> stockMap = new HashMap<>();

    void addItem(String item, int price, int stock) {
        priceMap.put(item, price);
        stockMap.put(item, stock);
    }

    int getPrice(String item) {
        return priceMap.get(item);
    }

    boolean isAvailable(String item) {
        return stockMap.get(item) > 0;
    }

    void reduceStock(String item) {
        stockMap.put(item, stockMap.get(item) - 1);
    }
}
