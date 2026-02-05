package stream_API;
import java.util.*;
import java.time.LocalDateTime;
public class TransactionLogger {
	public static void main(String[] args) {
		List<String> transactionIds = Arrays.asList("TXN1001", "TXN1002", "TXN1003", "TXN1004");
		
		transactionIds.forEach(id ->
		System.out.println(LocalDateTime.now() + " - Transaction: " + id));
	}
}
