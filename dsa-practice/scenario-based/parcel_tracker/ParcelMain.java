package parcel_tracker;

public class ParcelMain {
	public static void main(String[] args) {
		ParcelTracker tracker = new ParcelTracker();
		
		tracker.addStage("Order Placed");
		tracker.addStage("Dispatched");
		tracker.addStage("In Transit");
		tracker.addStage("Out for Delivery");
		tracker.addStage("Delivered");
		
		tracker.addCheckPoint("In Transit", "Reached Sorting Facility");
		
		tracker.trackParce();
	}
}
