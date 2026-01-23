package shopping_cart_system;

public class ShoppingCartMain {
	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();

		cart.addProduct("Apple", 50);
		cart.addProduct("Banana", 20);
		cart.addProduct("Milk", 60);
		cart.addProduct("Bread", 40);

		cart.addToCart("Apple", 2);
		cart.addToCart("Milk", 1);
		cart.addToCart("Banana", 5);
		cart.addToCart("Bread", 1);

		cart.displayCartOrder();
		cart.displaySortedByPrice();
		cart.displayTotalBill();
	}
}
