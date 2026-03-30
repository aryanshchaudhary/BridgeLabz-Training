package week_3;

import java.util.*;

public class InvoiceGenerator {
	static String[] parseInvoice(String input) {
		return input.split(",");
	}

	static int getTotalAmount(String[] tasks) {
		int total = 0;
		for (String task : tasks) {
			String[] parts = task.split("-");
			String amountPart = parts[1].replace("INR", "").trim();
			int amount = Integer.parseInt(amountPart);
			total += amount;
		}
		return total;
	}

	public static void main(String[] args) {
		String input = "Logo Design - 3000 INR, Web Page - 4500 INR";

        String[] tasks = parseInvoice(input);

        System.out.println("Invoice Details:");
        for (String task : tasks) {
            System.out.println(task.trim());
        }

        int totalAmount = getTotalAmount(tasks);
        System.out.println("\nTotal Invoice Amount: " + totalAmount + " INR");
	}
}
