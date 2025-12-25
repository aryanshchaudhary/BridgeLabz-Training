package level_1;

public class DiscountAMT {

	public static void main(String[] args) {
		double fee = 125000;
		double discountPercent = 10;
		double discount  = fee*(discountPercent/100);
		double PayAMT = fee-discount;
		System.out.println("The fee you have to pay by subtracting the discount from the fee is " + PayAMT);
	}
}
