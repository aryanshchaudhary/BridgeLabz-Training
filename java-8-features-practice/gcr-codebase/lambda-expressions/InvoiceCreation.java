package lambda_expressions;
import java.util.*;
import java.util.stream.*;
public class InvoiceCreation {
	static class Invoice{
		String transactionId;
		
		Invoice(String transactionId) {
			this.transactionId = transactionId;
		}
		
		@Override
		public String toString() {
			return "Invoice for Transaction ID: " + transactionId;
		}
	}
	public static void main(String[] args) {
		List<String> transactionIds = Arrays.asList("TXN1001", "TXN1002", "TXN1003", "TXN1004");

		List<Invoice> invoices = transactionIds.stream().map(id -> new Invoice(id)).collect(Collectors.toList());

		System.out.println("Generated Invoices:");
		invoices.forEach(System.out::println);
	}
}
