package courier_staff_shift_scheduler;

public class Main {
	public static void main(String[] args) {
		ShiftScheduler scheduler = new ShiftScheduler();

		Employee emp1 = new Employee(1, "Alice");
		Employee emp2 = new Employee(2, "Bob");

		try {
			scheduler.assignShift(emp1, ShiftTime.MORNING);
			scheduler.assignShift(emp2, ShiftTime.AFTERNOON);

			System.out.println("Shifts assigned successfully.");

			scheduler.assignShift(emp2, ShiftTime.MORNING); 
		} catch (ShiftAlreadyAssignedException e) {
			System.out.println(e.getMessage());
		}
	}
}
