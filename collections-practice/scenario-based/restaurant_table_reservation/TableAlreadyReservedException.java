package restaurant_table_reservation;

@SuppressWarnings("serial")
public class TableAlreadyReservedException extends Exception{
	public TableAlreadyReservedException(String message) {
		super(message);
	}
}
