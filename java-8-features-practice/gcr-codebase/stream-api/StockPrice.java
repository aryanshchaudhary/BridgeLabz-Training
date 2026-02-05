package stream_API;
import java.util.*;
public class StockPrice {
	public static void main(String[] args) {
		List<Double> stockPrices = Arrays.asList(150.5, 200.75, 120.0, 300.4, 250.6);
		
		stockPrices.forEach(price ->
		System.out.println("Stock Price: Rs. " + price));
	}
}
