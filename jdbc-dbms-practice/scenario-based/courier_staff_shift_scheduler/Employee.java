package courier_staff_shift_scheduler;

public class Employee {
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Employee employee = (Employee) obj;
		return id == employee.id;
	}
	
	@Override
	public int hashCode() {
		return Integer.hashCode(id);
	}
	
	@Override
	public String toString() {
		return id + " - " + name;
	}
}
