package level_1;
public class Product {
	static double discount = 10.0;
	String productName;
	double price;
	int quantity;
	final String productId;

	Product(String productName, double price, int quantity, String productId) {
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.productId = productId;
	}
	static void updateDiscount(double d) {
		discount = d;
	}
	void display(Object obj) {
		if (obj instanceof Product) {
			System.out.println("Product ID: " + productId);
			System.out.println("Product Name: " + productName);
			System.out.println("Price: $" + price);
			System.out.println("Quantity: " + quantity);
			System.out.println("Discount: " + discount + "%");
			System.out.println("Price after Discount: $" + (price - price * discount / 100));
		}
	}
	public static void main(String[] args) {
		Product p1 = new Product("Laptop", 1200, 5, "P001");
		Product p2 = new Product("Smartphone", 800, 10, "P002");

		p1.display(p1);
		p2.display(p2);
	}
}
