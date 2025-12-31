package level_1;
public class Employee {
	String name;
	int id;
	double salary;
	void display() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Salary: " + salary);
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name = "Rohan";
		emp.id = 1;
		emp.salary = 500000;
		emp.display();		
	}
}
