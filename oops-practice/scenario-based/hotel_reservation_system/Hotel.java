package hotel_reservation_system;

public class Hotel {
	private Room[] rooms = new Room[5];
    private Reservation[] reservations = new Reservation[5];
    private int resCount = 0;

    public Hotel() {
        rooms[0] = new StandardRoom(101);
        rooms[1] = new StandardRoom(102);
        rooms[2] = new DeluxeRoom(201);
        rooms[3] = new DeluxeRoom(202);
    }

    public void showRooms() {
        for (Room r : rooms) {
            if (r != null) {
                System.out.println("Room " + r.getRoomNumber() +
                        " Available: " + r.isAvailable());
            }
        }
    }

    public Reservation bookRoom(Guest guest, int roomNumber, int days)
            throws RoomNotAvailableException {

        for (Room r : rooms) {
            if (r != null && r.getRoomNumber() == roomNumber) {
                if (!r.isAvailable()) {
                    throw new RoomNotAvailableException("Room already booked!");
                }
                r.bookRoom();
                Reservation res = new Reservation(guest, r, days);
                reservations[resCount++] = res;
                return res;
            }
        }
        throw new RoomNotAvailableException("Room not found!");
    }

    public void checkout(Reservation res) {
        res.getRoom().freeRoom();
        System.out.println("Checkout successful.");
    }
}
