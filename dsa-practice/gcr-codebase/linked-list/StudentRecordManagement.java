package linked_list;
class Student{
	int Roll_Number;
	String Name;
	int Age;
	char Grade;
	Student next;
	
	public Student(int Roll_Number, String Name, int Age, char Grade) {
		this.Roll_Number = Roll_Number;
		this.Name = Name;
		this.Age = Age;
		this.Grade = Grade;
		next = null;
	}
}
class StudentManagement{
	static Student head = null;
	
	static void addAtEnd(int Roll_Number, String Name, int Age, char Grade) {
		Student node = new Student(Roll_Number, Name, Age, Grade);
		if(head == null) {
			head = node;
			return;
		}
		Student temp = head;
		while (temp.next != null)
			temp = temp.next;
		temp.next = node;
	}
	static void deleteByRoll(int Roll_Number) {
		if(head == null) return;
		if(head.Roll_Number == Roll_Number) {
			head = head.next;
			return;
		}
		
		Student temp = head;
		while(temp.next != null && temp.next.Roll_Number != Roll_Number)
			temp = temp.next;
		if(temp.next != null)
			temp.next = temp.next.next;
 	}
	static void search(int Roll_Number) {
		Student temp = head;
		while(temp != null) {
			if(temp.Roll_Number == Roll_Number) {
				System.out.println("Found: " + temp.Name + " Grade: " + temp.Grade);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Student not found");
	}
	static void updateGrade(int Roll_Number, char newGrade) {
		Student temp = head;
		while(temp != null) {
			if(temp.Roll_Number == Roll_Number) {
				temp.Grade = newGrade;
				return;
			}
			temp = temp.next;
		}
	}
	static void display() {
		Student temp = head;
		while(temp != null) {
			System.out.println(temp.Roll_Number + " " + temp.Name + " " + temp.Grade);
			temp = temp.next;
		}
	}
}
public class StudentRecordManagement {
	public static void main(String[] args) {
		StudentManagement.addAtEnd(1, "Aman", 20, 'A');
        StudentManagement.addAtEnd(2, "Riya", 21, 'B');
        StudentManagement.display();
        StudentManagement.updateGrade(2, 'A');
        StudentManagement.search(2);
        StudentManagement.deleteByRoll(1);
        StudentManagement.display();
	}
}
