package traffic_manager;

import java.util.LinkedList;
import java.util.Queue;

public class TrafficManager {
	private Vehicle head = null;
	private Queue<Integer> waitingQueue = new LinkedList<>();
	private int maxQueueSize = 5;

	public void addVehicle(int id) {
		Vehicle newVehicle = new Vehicle(id);
		if (head == null) {
			head = newVehicle;
			newVehicle.next = head;
		} else {
			Vehicle temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = newVehicle;
			newVehicle.next = head;
		}
		System.out.println("Vehicle " + id + " added");
	}

	public void removeVehicle(int id) {
		if (head == null) {
			System.out.println("No vehicles to remove");
			return;
		}
		Vehicle curr = head, prev = null;
		do {
			if (curr.id == id) {
				if (prev != null) {
					prev.next = curr.next;
				} else {
					Vehicle tail = head;
					while (tail.next != head) {
						tail = tail.next;
					}
					head = head.next;
					tail.next = head;
				}
				System.out.println("Vehicle " + id + " removed");
				return;
			}
			prev = curr;
			curr = curr.next;
		} while (curr != head);

		System.out.println("Vehicle not found");
	}

	public void addToQueue(int id) {
		if (waitingQueue.size() == maxQueueSize) {
			System.out.println("Queue Overflow");
		} else {
			waitingQueue.add(id);
			System.out.println("Vehicle " + id + " added to waiting queue");
		}
	}

	public void moveFromQueueToRoundabout() {
		if (waitingQueue.isEmpty()) {
			System.out.println("Queue Underflow");
		} else {
			addVehicle(waitingQueue.poll());
		}
	}

	public void printRoundabout() {
		if (head == null) {
			System.out.println("Roundabout empty");
			return;
		}

		Vehicle temp = head;
		System.out.print("Roundabout: ");
		do {
			System.out.print(temp.id + " -> ");
			temp = temp.next;
		} while (temp != head);
		System.out.println("(back to start)");
	}
}
