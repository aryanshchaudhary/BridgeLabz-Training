package encapsulation_polymorphism;
import java.util.*;
interface Taxable{
	double calculateTax();
	String getTaxDetails();
}
abstract class Product{
	private int productID;
	private String name;
	protected double price;
	
	public Product(int ID, String name, double price) {
		this.productID = ID;
		this.name = name;
		this.price = price;
	}
	public abstract double calculateDiscount();
	public double getFinalPrice() {
		double tax = (this instanceof Taxable)
				? ((Taxable)this).calculateTax()
						:0;
		return price + tax - calculateDiscount();
	}
}
class Electronics extends Product implements Taxable{
	public Electronics(int id, String name, double price) {
		super(id, name, price);
	}
	public double calculateDiscount() {
		return price * 0.10;
	}
	public double calculateTax() {
		return price * 0.18;
	}
	public String getTaxDetails() {
		return "18% GST";
	}
}
class Clothing extends Product{
	public Clothing(int id, String name, double price) {
		super(id, name, price);
	}
	public double calculateDiscount() {
		return price * 0.20;
	}
}
public class ECommercePlatform {
	public static void main(String[] args) {
		List<Product> products = List.of(
				new Electronics(1, "Laptop", 60000),
				new Clothing(2, "Jacket", 3000)
				);
		for(Product p : products) {
			System.out.println("Final Price: " + p.getFinalPrice());
		}
	}
}
