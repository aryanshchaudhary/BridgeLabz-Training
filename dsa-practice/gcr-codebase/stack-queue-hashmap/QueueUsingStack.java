package stack_queue_hashmap;
import java.util.*;
public class QueueUsingStack {
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	
	void enqueue(int x) {
		s1.push(x);
	}
	
	int dequeue() {
		if(s2.isEmpty()) {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
	public static void main(String[] args) {
		QueueUsingStack q = new QueueUsingStack();
		q.enqueue(5);
		q.enqueue(10);
		q.enqueue(15);
		System.out.println(q.dequeue()); 
		System.out.println(q.dequeue());
	}
}
