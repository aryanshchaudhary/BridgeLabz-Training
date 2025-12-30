package scenario_based;
import java.util.*;
public class LineComparison {
	
	// Use Case1
	static double lineLength() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter cordinates for point 1 : ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.print("Enter cordinates for point 2 : ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		return Math.round((Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2))));
	}
	
	// Use Case2
	static boolean lineEquality(double l1, double l2) {
		return l1 == l2;
	}
	
	// Use Case3
	static String comparison(double l1, double l2) {
		double difference = l1-l2;
		if(difference>0) 
			return "Line-1 is greater";
		else if (difference==0)
			return "Line-1 and Line-2 are equal";
		else
			return "Line-2 is greater";
	}
		
	public static void main(String[] args) {
		System.out.println("Enter the cordinates for line 1");
		double l1 = lineLength();
		System.out.println("Line 1 Length: " + l1);
		System.out.println("Enter the cordinates for line 2");
		double l2 = lineLength();
		System.out.println("Line 2 Length: " + l2);
		System.out.println("\nAre both the lines equal? " + lineEquality(l1,l2));
		System.out.println("\nComparison Result: " + comparison(l1,  l2));
	}
}
