package courier_staff_shift_scheduler;

@SuppressWarnings("serial")
public class ShiftAlreadyAssignedException extends Exception {
    public ShiftAlreadyAssignedException(String message) {
        super(message);
    }
}
