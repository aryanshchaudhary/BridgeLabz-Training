package courier_staff_shift_scheduler;

import java.util.*;

public class ShiftScheduler {
	private List<Employee> staffList = new ArrayList<>();
	private Map<ShiftTime, List<Employee>> shiftMap = new HashMap<>();

	public ShiftScheduler() {
		for (ShiftTime shift : ShiftTime.values()) {
			shiftMap.put(shift, new ArrayList<>());
		}
	}

	public void addEmployee(Employee employee) {
		staffList.add(employee);
	}

	public void assignShift(Employee employee, ShiftTime shift) throws ShiftAlreadyAssignedException {

		List<Employee> employeesInShift = shiftMap.get(shift);

		if (employeesInShift.contains(employee)) {
			throw new ShiftAlreadyAssignedException("Employee already assigned to " + shift + " shift");
		}

		employeesInShift.add(employee);
	}
	
	public void displayShiftAssignments() {
		for (Map.Entry<ShiftTime, List<Employee>> entry : shiftMap.entrySet()) {
			System.out.println(entry.getKey() + " Shift:");
			for (Employee emp : entry.getValue()) {
				System.out.println(" - " + emp);
			}
		}
	}
}
