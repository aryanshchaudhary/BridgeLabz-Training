package inheritance;
public class OnlineRetailOrderManagement {
	public static void main(String[] args) {
		Order o = new DeliveredOrder(101);
        System.out.println(o.getOrderStatus());
	}
}
class Order {
    int orderId;

    Order(int id) {
        orderId = id;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    ShippedOrder(int id) {
        super(id);
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}
class DeliveredOrder extends ShippedOrder {
    DeliveredOrder(int id) {
        super(id);
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}
