package warehouse_management;

public class SmartWareHouse {
	public static void main(String[] args) {
		Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Mobile"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));

        System.out.println("Electronics");
        WareHouse.displayAllItems(electronicsStorage.getItems());

        System.out.println("Groceries");
        WareHouse.displayAllItems(groceryStorage.getItems());

        System.out.println("Furniture");
        WareHouse.displayAllItems(furnitureStorage.getItems());
	}
}
