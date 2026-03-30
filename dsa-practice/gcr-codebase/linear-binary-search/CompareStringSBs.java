package linear_binary_search;

public class CompareStringSBs {
	public static void main(String[] args) {
		int n = 1_00_000;
		
		// buffer test
		StringBuffer sb1 = new StringBuffer();
		long startTime1 = System.nanoTime();
		for (int i = 0; i < n; i++) {
			sb1.append("a");
		}
		long endTime1 = System.nanoTime();
		long duration1 = endTime1 - startTime1;
		
		// builder test
		StringBuilder sb2 = new StringBuilder();
		long startTime2 = System.nanoTime();
		for (int i = 0; i < n; i++) {
			sb2.append("a");
		}
		long endTime2 = System.nanoTime();
		long duration2 = endTime2 - startTime2;
		
		System.out.println("StringBuffer time: " + duration1 + " ns");
		System.out.println("StringBuilder time: " + duration2 + " ns");
	}
}
