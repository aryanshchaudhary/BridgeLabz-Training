package warehouse_management;

class Electronics extends WareHouseItem {
	public Electronics(String name) {
		super(name);
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Electronics Item: " + getName());
	}
}
