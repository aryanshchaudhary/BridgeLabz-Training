package stack_queue_hashmap;
import java.util.*;
public class SortStackRecursion {
	static void sortStack(Stack<Integer> stack) {
		if (!stack.isEmpty()) {
			int temp = stack.pop();
			sortStack(stack);
			insertSorted(stack, temp);
		}
	}
	static void insertSorted(Stack<Integer> stack, int x) {
		if(stack.isEmpty() || stack.peek() <= x) {
            stack.push(x);
            return;
		}
		int temp = stack.pop();
		insertSorted(stack, x);
		stack.push(temp);
	}
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(34);
		stack.push(3);
		stack.push(31);
		stack.push(98);
		
		sortStack(stack);
		System.out.println(stack);
	}
}
