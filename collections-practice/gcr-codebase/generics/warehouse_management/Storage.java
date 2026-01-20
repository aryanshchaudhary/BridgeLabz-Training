package warehouse_management;
import java.util.ArrayList;
import java.util.List;

public class Storage<T extends  WareHouseItem> {
	private List<T> items = new ArrayList<>();
	
	public void addItem(T item) {
		items.add(item);
	}
	
	public List<T> getItems(){
		return items;
	}
}
