package level_3;
import java.util.*;
public class Football {
	static int[] genHeight() {
		int[] heights = new int[11];
		Random r = new Random();
		for(int i=0;i<heights.length;i++) {
			heights[i]=150+r.nextInt(101);
		}
		return heights;
	}
	static int Sum(int[] heights) {
		int sum=0;
		for(int h: heights) {
			sum+=h;
		}
		return sum;
	}
	static double Mean(int[] heights) {
		return (double) Sum(heights)/heights.length;
	}
	static int Shortest(int[] heights) {
		int min = heights[0];
		for(int h:heights) {
			if(h<min)
				min=h;
		}
		return min;
	}
	static int Tallest(int[] heights) {
		int max = heights[0];
		for(int h:heights) {
			if(h>max)
				max=h;
		}
		return max;
	}
	public static void main(String[] args) {
		 int[] heights = genHeight();
	        System.out.println("Player Heights (cm):");
	        for (int h : heights) {
	            System.out.print(h + " ");
	        }
	        System.out.println("\n\nShortest Height: " + Shortest(heights) + " cm");
	        System.out.println("Tallest Height : " + Tallest(heights) + " cm");
	        System.out.printf("Mean Height    : %.2f cm\n", Mean(heights));
	}
}
