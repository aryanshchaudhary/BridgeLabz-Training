package level_1;
import java.util.Scanner;
public class FeeDiscount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the fee amount");
		double fee = sc.nextDouble();
		System.out.print("Enter discount percent");
		double dis_Percent = sc.nextDouble();
		double discount = (fee*dis_Percent) / 100;
        double Pay_AMT = fee-discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + Pay_AMT);
	}
}
