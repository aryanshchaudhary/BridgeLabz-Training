package level_1;
public class Item {
	String itemCode;
	String itemName;
	double price;
	void display() {
		System.out.println("The item code is: " + itemCode);
		System.out.println("The item price is: " + price);
		System.out.println("The item name is: " + itemName);
	}
	public static void main(String[] args) {
		Item I1 = new Item();
		Item I2 = new Item();
		Item I3 = new Item();
		
		I1.itemCode = "01AA";
		I1.price = 500.0;
		I1.itemName = "Water bottle";
		I2.itemCode = "01BB";
		I2.price = 700.0;
		I2.itemName = "Rice";
		I3.itemCode = "02AA";
		I3.price = 400.0;
		I3.itemName = "blackboard";
		I1.display();
		System.out.println("------------------------------");
		I2.display();
		System.out.println("------------------------------");
		I3.display();
		System.out.println("------------------------------");
	}
}
