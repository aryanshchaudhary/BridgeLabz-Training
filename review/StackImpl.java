package review;
import java.util.*;

class Stack {
	private int[] stack;
	private int top;
	private int size;

	public Stack(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
	}

	public void push(int value) {
		if (top == size - 1) {
			System.out.println("Stack Overflow");
			return;
		}
		stack[++top] = value;
		System.out.println(value);
	}

	public void pop() {
		if (top == -1) {
			System.out.println("Stack is Underflow");
			return;
		}
		System.out.println(stack[top--]);
	}

	public int peek() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return -1;
		}
		return stack[top];
	}

	public void display() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.print("Stack elements: ");
		for (int i = top; i >= 0; i--) {
			System.out.print(stack[i] + " ");
		}
	}
}

public class StackImpl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter stack size: ");
		int size = sc.nextInt();
		Stack stack = new Stack(size);

		while (true) {
			System.out.println("Select operation:");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter the value: ");
				int value = sc.nextInt();
				stack.push(value);
				break;
			case 2:
				stack.pop();
				break;
			case 3:
				int topValue = stack.peek();
				if (topValue != -1) {
					System.out.println("Top element is: " + topValue);
				}
				break;
			case 4:
				stack.display();
				break;
			case 5:
				System.out.println("Exiting the stack");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}