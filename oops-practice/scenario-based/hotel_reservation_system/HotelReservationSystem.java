package hotel_reservation_system;

public class HotelReservationSystem {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
        Guest guest = new Guest(1, "Aryansh");

        hotel.showRooms();

        try {
            Reservation res = hotel.bookRoom(guest, 201, 3);

            PricingStrategy pricing =
                    new SeasonalPricing(1.5); 

            System.out.println("Invoice Amount: ₹" +
                    res.generateInvoice(pricing));

            hotel.checkout(res);
        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
	}
}
