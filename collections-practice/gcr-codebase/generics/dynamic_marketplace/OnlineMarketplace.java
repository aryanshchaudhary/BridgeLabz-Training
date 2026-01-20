package dynamic_marketplace;

public class OnlineMarketplace {
	public static void main(String[] args) {
		Product<BookCategory> book =
                new Product<>("Java Programming", 500, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", 800, new ClothingCategory());

        Product<GadgetCategory> phone =
                new Product<>("Smartphone", 15000, new GadgetCategory());

        Catalog catalog = new Catalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        System.out.println("Before Discount:");
        catalog.displayProducts();

        DiscountService.applyDiscount(book, 10);
        DiscountService.applyDiscount(phone, 20);

        System.out.println("\nAfter Discount:");
        catalog.displayProducts();
	}
}
