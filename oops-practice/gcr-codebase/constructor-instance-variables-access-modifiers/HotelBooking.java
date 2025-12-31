package level_1;
public class HotelBooking {
	String guestName;
	String roomType;
	int nights;
	HotelBooking(){
		guestName = "Guest";
		roomType = "Standard";
		nights = 1;
	}
	HotelBooking(String g, String r, int n){
		guestName = g;
		roomType = r;
		nights = n;
	}
	HotelBooking(HotelBooking h){
		guestName = h.guestName;
		roomType = h.roomType;
		nights = h.nights;
	}
	void display() {
		System.out.println("Name is " + guestName + " room type is " + roomType + " and the nights to stay: " + nights);
	}
	public static void main(String[] args) {
		HotelBooking h1 = new HotelBooking();
		HotelBooking h2 = new HotelBooking("Aryansh Chaudhary", "Standard", 1);
		HotelBooking h3 = new HotelBooking(h2);
		
		h1.display();
		h2.display();
		h3.display();
	}
}
