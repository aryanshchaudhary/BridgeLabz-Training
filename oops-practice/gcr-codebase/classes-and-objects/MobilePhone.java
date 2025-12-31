package level_1;
public class MobilePhone {
	String brand;
	String model;
	double price;
	void display() {
		System.out.println("Brand of mobile: " + brand);
		System.out.println("Model of mobile: " + model);
		System.out.println("Price of mobile: " + price);
	}
	public static void main(String[] args) {
		MobilePhone M1 = new MobilePhone();
		MobilePhone M2 = new MobilePhone();
		MobilePhone M3 = new MobilePhone();
		
		M1.brand = "VIVO";
		M1.model = "VIVO V29";
		M1.price = 15999.0;
		M2.brand = "ONE PLUS";
		M2.model = "ONE PLUS nord4";
		M2.price = 39999.0;
		M3.brand = "APPLE";
		M3.model = "iphone pro16";
		M3.price = 79999.0;
		M1.display();
		System.out.println("------------------------------");
		M2.display();
		System.out.println("------------------------------");
		M3.display();
		System.out.println("------------------------------");
	}
}
