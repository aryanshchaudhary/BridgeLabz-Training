package hotel_reservation_system;

public abstract class Room {
	protected int roomNumber;
	protected boolean available = true;
	protected double basePrice;
	
	public Room(int roomNumber, double basePrice) {
		this.roomNumber = roomNumber;
		this.basePrice = basePrice;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public boolean isAvailable() {
		return available;
	}
	public void bookRoom() {
		available = false;
	}
	public void freeRoom() {
		available = true;
	}
	public abstract double calculatePrice(PricingStrategy strategy);
}
