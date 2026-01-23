package queue_interface;

public class CircularBuffer {
	int[] buffer;
	int front = 0, size = 0;

	CircularBuffer(int capacity) {
		buffer = new int[capacity];
	}

	void add(int value) {
		buffer[(front + size) % buffer.length] = value;
		if (size < buffer.length) {
			size++;
		} else {
			front = (front + 1) % buffer.length;
		}
	}

	void display() {
		for (int i = 0; i < size; i++) {
			System.out.print(buffer[(front + i) % buffer.length] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		CircularBuffer cb = new CircularBuffer(3);
		cb.add(1);
		cb.add(2);
		cb.add(3);
		cb.display();
		cb.add(4);
		cb.display();
		cb.add(5);
		cb.display();
	}
}
