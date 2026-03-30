package traffic_manager;

public class TrafficManager {
	public static void main(String[] args) {
		Roundabout roundabout = new Roundabout();
        VehicleQueue queue = new VehicleQueue(3);

        queue.enqueue(101);
        queue.enqueue(102);
        queue.enqueue(103);
        queue.enqueue(104); 

        while (!queue.isEmpty()) {
            int vehicleId = queue.dequeue();
            if (vehicleId != -1)
                roundabout.addVehicle(vehicleId);
        }

        roundabout.display();

        roundabout.removeVehicle();
        roundabout.display();

        roundabout.removeVehicle();
        roundabout.display();
	}
}
