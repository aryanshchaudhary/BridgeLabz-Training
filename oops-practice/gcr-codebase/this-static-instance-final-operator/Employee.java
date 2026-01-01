package level_1;
public class Employee {
	static String companyName = "IT Company PVT. LTD.";
	static int totalEmployee = 0;
	final int id;
	String name;
	String designation;
	Employee(int id, String name, String designation){
		this.id = id;
		this.name = name;
		this.designation = designation;
		totalEmployee++;
	}
	static void displayTotalEmployee() {
		System.out.println("Total Employees: " + totalEmployee);
	}
	void display(Object obj) {
		if(obj instanceof Employee) {
			System.out.println("Company Name: " + companyName);
			System.out.println("Employee ID: " + id);
			System.out.println("Name: " + name);
			System.out.println("Designation: " + designation);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Hari", "Team Leader");
		Employee e2 = new Employee(102, "Ram", "Manager");
		
		displayTotalEmployee();
		
		e1.display(e1);
		e2.display(e2);
	}
}
