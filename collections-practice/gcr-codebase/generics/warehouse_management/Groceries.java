package warehouse_management;

class Groceries extends WareHouseItem {
	public Groceries(String name) {
		super(name);
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Grocery Item: " + getName());
	}
}
