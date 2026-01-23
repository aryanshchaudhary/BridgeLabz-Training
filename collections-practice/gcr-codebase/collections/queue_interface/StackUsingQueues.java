package queue_interface;
import java.util.*;
public class StackUsingQueues {
	Queue<Integer> queue1 = new LinkedList<>();
	Queue<Integer> queue2 = new LinkedList<>();
	
	void push(int value) {
		queue2.add(value);
		while (!queue1.isEmpty()) {
			queue2.add(queue1.remove());
		}
		
		Queue<Integer> temp = queue1;
		queue1 = queue2;
		queue2 = temp;
	}
	
	int pop() {
		return queue1.remove();
	}
	
	int top() {
		return queue1.peek();
	}
	public static void main(String[] args) {
		StackUsingQueues stack = new StackUsingQueues();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.pop()); 
	}
}
