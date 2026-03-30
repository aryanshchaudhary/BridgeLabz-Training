package level_1;
public class Student {
	static String universityName = "Global University";
	static int totalStudents=0;
	String name;
	final int rollNumber;
	char grade;
	Student(int rollNumber, String name, char grade){
		this.rollNumber = rollNumber;
		this.name = name;
		this.grade = grade;
		totalStudents++;
	}
	static void displayTotalStudents() {
		System.out.println("Total Students: " + totalStudents);
	}
	void updateGrade(char newGrade) {
		this.grade = newGrade;
		System.out.println("Grade updated to: " + grade);
	}
	void display(Object obj) {
        if (obj instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
	public static void main(String[] args) {
		Student s1 = new Student(101, "Hemashree", 'A');
		Student s2 = new Student(102, "Sharmila", 'B');
		
		displayTotalStudents();
		s1.display(s1);
		s2.display(s2);
		
		s2.updateGrade('A');
		s2.display(s2);
	}
}
