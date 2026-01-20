package traffic_manager;

public class TrafficMain {
	public static void main(String[] args) {
		TrafficManager tm = new TrafficManager();

		tm.addVehicle(101);
		tm.addVehicle(102);
		tm.addVehicle(103);
		tm.printRoundabout();

		tm.removeVehicle(102);
		tm.printRoundabout();

		tm.addToQueue(201);
		tm.addToQueue(202);
		tm.moveFromQueueToRoundabout();
		tm.printRoundabout();
	}
}
