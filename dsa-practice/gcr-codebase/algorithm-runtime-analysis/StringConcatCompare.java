package algorithm_runtime_analysis;

public class StringConcatCompare {
	public static void main(String[] args) {
		int N = 100_000;
		
		// Using String
		long startTime1 = System.nanoTime();
		String str = "";
		for (int i = 0; i < N; i++) {
			str += "a";
		}
		long endTime1 = System.nanoTime();
		long duration1 = endTime1 - startTime1;
		System.out.println("String concatenation time: " + duration1 + " ns");
		
		// Using StringBuilder
		long startTime2 = System.nanoTime();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append("a");
		}
		long endTime2 = System.nanoTime();
		long duration2 = endTime2 - startTime2;
		System.out.println("StringBuilder concatenation time: " + duration2 + " ns");
		
		// Using StringBuffer
		long startTime3 = System.nanoTime();
		StringBuffer sbuf = new StringBuffer();
		for (int i = 0; i < N; i++) {
			sbuf.append("a");
		}
		long endTime3 = System.nanoTime();
		long duration3 = endTime3 - startTime3;
		System.out.println("StringBuffer concatenation time: " + duration3 + " ns");
	}
}
