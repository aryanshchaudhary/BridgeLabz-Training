package warehouse_management;

abstract class WareHouseItem {
	private String name;
	
	public WareHouseItem(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void displayInfo();
}
