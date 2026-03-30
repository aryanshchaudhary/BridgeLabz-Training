package warehouse_management;
import java.util.List;

public class WareHouse {
	public static void displayAllItems(List<? extends WareHouseItem> items) {
		for(WareHouseItem item : items) {
			item.displayInfo();
		}
	}
}
