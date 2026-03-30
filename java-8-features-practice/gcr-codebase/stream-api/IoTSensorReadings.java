package stream_API;
import java.util.*;
public class IoTSensorReadings {
	public static void main(String[] args) {
		
		List<Integer> readings = Arrays.asList(45, 60, 75, 90, 30, 55, 80);
		int threshold = 60;
		
		readings.stream()
		.filter(r -> r > threshold)
		.forEach(r ->
		System.out.println("High Reading: " + r));
	}
}
