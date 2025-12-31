package level_1;
public class Employee {
	public int employeeID;
	protected String department;
	private double salary;

	public void setSalary(double s) {
		salary = s;
	}
	public double getSalary() {
		return salary;
	}
	public static void main(String[] args) {
		Manager m = new Manager();
		m.employeeID = 10;
		m.department = "IT";
		m.setSalary(60000);
		m.getemployeeID();
		m.getdepartment();

		System.out.println("Salary: " + m.getSalary());
	}
}
class Manager extends Employee {
	public void getemployeeID() {
		System.out.println("Employee ID: " + employeeID );
	}
	public void getdepartment() {
		System.out.println("Department: " + department);
	}
}
