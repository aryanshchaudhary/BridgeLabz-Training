package warehouse_management;

class Furniture extends WareHouseItem{
	public Furniture(String name) {
		super(name);
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Furniture Item: " + getName());
	}
}
