package encapsulation_polymorphism;
import java.util.*;
interface Department{
	void assignDepartment(String dept);
	String getDepartmentDetails();
}
abstract class Employee{
	private int employeeId;
	private String name;
	protected double baseSalary;
	private String department;
	
	public Employee(int id, String name, double baseSalary) {
		this.employeeId = id;
		this.name = name;
		this.baseSalary = baseSalary;
}
	public void assignDepartment(String dept) {
		department = dept;
	}
	public String getDepartmentDetails() {
		return department;
	}
	public abstract double calculateSalary();
	public void displayDetails() {
		System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + calculateSalary() + ", Department: " + department);
	}
}
class FullTimeEmployee extends Employee implements Department{
//	private String department;
	public FullTimeEmployee(int id, String name, double salary) {
		super(id, name, salary);
	}
	public double calculateSalary() {
		return baseSalary;
	}
	
}
class PartTimeEmployee extends Employee{
	private int hoursWorked;
	private double ratePerHour;
	
	public PartTimeEmployee(int id, String name, int hours, double rate) {
		super(id, name, 0);
		this.hoursWorked = hours;
		this.ratePerHour = rate;
	}
	public double calculateSalary() {
		return hoursWorked*ratePerHour;
	}
}
public class EmployeeManagementSystem {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new FullTimeEmployee(1, "Rohan", 50000));
		employees.add(new PartTimeEmployee(2, "Amit",20 , 500));
		employees.get(0).assignDepartment("IT");
		employees.get(1).assignDepartment("Sales");
		employees.add(new FullTimeEmployee(3, "Ankit", 54434));	
		employees.get(2).assignDepartment("HR");
		for(Employee e: employees) {
			e.displayDetails();
		}
	}
}
