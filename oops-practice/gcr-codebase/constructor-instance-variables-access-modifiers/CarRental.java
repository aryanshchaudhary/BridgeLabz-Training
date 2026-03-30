package level_1;
import java.util.*;
public class CarRental {
	String customerName;
	String carModel;
	int rentalDays;
	double costPerDay;
	CarRental(double costPerDay){
		customerName = "Tony Stark";
		carModel = "BMW M2 Competition";
		rentalDays = 5;
		this.costPerDay = costPerDay;
	}
	double totalCost() {
		return rentalDays*costPerDay;
	}
	void display() {
		System.out.println("\nCustomer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : " + totalCost());
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the per day cost of rent : ");
		double cost = sc.nextDouble();
		CarRental r = new CarRental(cost);
		r.display();
		sc.close();
	}
}
