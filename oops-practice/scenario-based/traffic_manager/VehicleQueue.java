package traffic_manager;

public class VehicleQueue {
	private int[] queue;
    private int front, rear, capacity;

    VehicleQueue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = rear = -1;
    }

    public void enqueue(int id) {
        if (rear == capacity - 1) {
            System.out.println("Queue Overflow! Vehicle " + id + " cannot enter");
            return;
        }

        if (front == -1) front = 0;
        queue[++rear] = id;
        System.out.println("Vehicle " + id + " waiting in queue");
    }

    public int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow! No vehicle waiting");
            return -1;
        }

        return queue[front++];
    }

    public boolean isEmpty() {
        return front == -1 || front > rear;
    }
}
