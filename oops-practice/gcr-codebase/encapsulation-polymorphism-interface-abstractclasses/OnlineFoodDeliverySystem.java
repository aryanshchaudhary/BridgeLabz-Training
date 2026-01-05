package encapsulation_polymorphism;

import java.util.*;

interface Discountable {
	public double applyDiscount();

	public String getDiscountDetails();
}

abstract class FoodItem {
	private String itemName;
	protected double price;
	protected int quantity;

	public FoodItem(String itemName, double price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

	public abstract double calculateTotalPrice();

	public void getItemDetails() {
		System.out.println("Item Name: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
	}
}
class VegItem extends FoodItem implements Discountable {
	public VegItem(String itemName, double price, int quantity) {
		super(itemName, price, quantity);
	}
	public double calculateTotalPrice() {
		return price * quantity;
	}

	public double applyDiscount() {
		return calculateTotalPrice() * 0.10;
	}

	public String getDiscountDetails() {
		return "10% Veg Discount";
	}
	
}
class NonVegItem extends FoodItem implements Discountable {
	public NonVegItem(String itemName, double price, int quantity) {
		super(itemName, price, quantity);
	}
	public double calculateTotalPrice() {
		return (price * quantity) + 50;
	}

	public double applyDiscount() {
		return calculateTotalPrice() * 0.05;
	}

	public String getDiscountDetails() {
		return "5% Non-Veg Discount";
	}
	
}
public class OnlineFoodDeliverySystem {
	public static void main(String[] args) {
		FoodItem[] order = new FoodItem[2];
		order[0] = new VegItem("Paneer Butter Masala", 200, 2);
		order[1] = new NonVegItem("Chicken Tandoori", 350, 2);
		for(FoodItem item : order) {
			item.getItemDetails();
			double total = item.calculateTotalPrice();
			Discountable d = (Discountable) item;
			double discount = d.applyDiscount();
			System.out.println("Discount: " + discount +
                    " (" + d.getDiscountDetails() + ")");
            System.out.println("Final Amount: " + (total - discount));
		}
		
	}
}
