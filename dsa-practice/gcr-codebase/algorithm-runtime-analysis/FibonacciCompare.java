package algorithm_runtime_analysis;

public class FibonacciCompare {
	
	// Recursive Fibonacci
	public static int fibonacciRecurse(int n) {
		if(n <= 1) 
			return n;
		return fibonacciRecurse(n - 1) + fibonacciRecurse(n - 2);
	}
	
	// Iterative Fibonacci
	public static int fibonacciIterate(int n) {
		if (n <= 1)
			return n;
		int a = 0, b = 1, sum = 0;
		for (int i = 2; i <= n; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		return sum;
	}
	public static void main(String[] args) {
		int n = 10;
		
		// Recursive Fibonacci Timing
		long startTime1 = System.nanoTime();
		fibonacciRecurse(n);
		long endTime1 = System.nanoTime();
		long duration1 = endTime1 - startTime1;
		
		// Iterative Fibonacci Timing
		long startTime2 = System.nanoTime();
		fibonacciIterate(n);
		long endTime2 = System.nanoTime();
		long duration2 = endTime2 - startTime2;
		
		System.out.println("Recursive Fibonacci: " + fibonacciRecurse(n));
		System.out.println("Recursive Fibonacci time: " + duration1 + " ns");
		System.out.println("Iterative Fibonacci: " + fibonacciIterate(n));
		System.out.println("Iterative Fibonacci time: " + duration2 + " ns");
	}
}
