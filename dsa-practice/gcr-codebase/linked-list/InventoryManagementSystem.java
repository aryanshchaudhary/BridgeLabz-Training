package linked_list;
class Item{
	String itemName;
	int itemId;
	int quantity;
	double price;
	Item next;
	
	public Item(String itemName, int itemId, int quantity, double price) {
		this.itemName = itemName;
		this.itemId = itemId;
		this.quantity = quantity;
		this.price = price;
		next = null;
	}
}
class ItemManagement{
	static Item head = null;
	
	public void addAtStart(String itemName, int itemId, int quantity, double price) {
		Item newItem = new Item(itemName, itemId, quantity, price);
		newItem.next = head;
		head = newItem;
	}
	public void addAtEnd(String itemName, int itemId, int quantity, double price) {
		Item newItem = new Item(itemName, itemId, quantity, price);
		if(head == null) {
			head = newItem;
			return;
		}
	}
	public void addAtPosition(int pos, String itemName, int itemId, int quantity, double price) {
		if(pos <= 1) {
			addAtStart(itemName, itemId, quantity, price);
			return;
		}
		Item newItem = new Item(itemName, itemId, quantity, price);
		Item temp = head;
		for(int i = 0; i<pos-1 && temp != null; i++ ) {
			temp = temp.next;
		}
		if(temp == null) {
			addAtEnd(itemName, itemId, quantity, price);
		}else {
			newItem.next = temp.next;
			temp.next = newItem;
		}
	}
	
	public void removeById(int itemId) {
		if(head==null) return;
		if(head.itemId == itemId) {
			head = head.next;
			System.out.println("Item Removed");
			return;
		}
		Item temp = head;
		while(temp.next != null && temp.next.itemId != itemId) {
			temp = temp.next;
		}
		if(temp.next != null) {
			temp.next = temp.next.next;
			System.out.println("Item Removed");
		}else {
			System.out.println("Item not found");
		}
	}
	
	public void updateQuantity(int itemId, int newQuantity) {
		Item temp = head;
		while(temp != null) {
			if(temp.itemId == itemId) {
				temp.quantity = newQuantity;
				System.out.println("Quantity Updated");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Item not found");
	}
	
	public void searchById(int itemId) {
		Item temp = head;
		while(temp != null) {
			if(temp.itemId == itemId) {
				displayItem(temp);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Item not found");
	}
	public void searchByName(String Name) {
		Item temp = head;
		boolean found = false;
		while(temp != null) {
			if(temp.itemName.equalsIgnoreCase(Name)) {
				displayItem(temp);
				found = true;
			}
			temp = temp.next;
		}
		if(!found) System.out.println("Item not found");
	}
	public double calculateTotalValue() {
		double total = 0;
		Item temp = head;
		while(temp != null) {
			total += temp.quantity*temp.price;
			temp = temp.next;
		}
		return total;
	}
	public void sortByName(boolean ascending) {
        head = mergeSort(head, ascending, true);
    }

    public void sortByPrice(boolean ascending) {
        head = mergeSort(head, ascending, false);
    }

    private Item mergeSort(Item h, boolean asc, boolean byName) {
        if (h == null || h.next == null) return h;

        Item mid = getMiddle(h);
        Item nextMid = mid.next;
        mid.next = null;

        Item left = mergeSort(h, asc, byName);
        Item right = mergeSort(nextMid, asc, byName);

        return merge(left, right, asc, byName);
    }

    private Item merge(Item a, Item b, boolean asc, boolean byName) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (byName) {
            condition = asc ?
                    a.itemName.compareToIgnoreCase(b.itemName) <= 0 :
                    a.itemName.compareToIgnoreCase(b.itemName) > 0;
        } else {
            condition = asc ? a.price <= b.price : a.price > b.price;
        }

        if (condition) {
            a.next = merge(a.next, b, asc, byName);
            return a;
        } else {
            b.next = merge(a, b.next, asc, byName);
            return b;
        }
    }

    private Item getMiddle(Item h) {
        Item slow = h, fast = h.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
	
    public void displayInventory() {
    	if(head == null) {
    		System.out.println("Inventory empty");
    		return;
    	}
    	Item temp = head;
    	while(temp != null) {
    		displayItem(temp);
    		temp = temp.next;
    	}
    }
    private void displayItem(Item item) {
    	System.out.println(
    			"ID: " + item.itemId +
                ", Name: " + item.itemName +
                ", Qty: " + item.quantity +
                ", Price: " + item.price
    			);
    }
}
public class InventoryManagementSystem {
	public static void main(String[] args) {
		ItemManagement inv = new ItemManagement();

        inv.addAtEnd("Laptop", 101, 5, 60000);
        inv.addAtStart("Mouse", 102, 20, 500);
        inv.addAtEnd("Keyboard", 103, 10, 1500);
        inv.addAtPosition(2,"Monitor", 104,7, 12000);

        System.out.println("\nInventory:");
        inv.displayInventory();

        System.out.println("\nSearch by ID:");
        inv.searchById(103);

        System.out.println("\nUpdate Quantity:");
        inv.updateQuantity(102, 30);

        System.out.println("\nTotal Inventory Value: " + inv.calculateTotalValue());

        System.out.println("\nSorted by Name (Ascending):");
        inv.sortByName(true);
        inv.displayInventory();

        System.out.println("\nSorted by Price (Descending):");
        inv.sortByPrice(false);
        inv.displayInventory();

        System.out.println("\nRemove Item:");
        inv.removeById(101);
        inv.displayInventory();
	}
}
