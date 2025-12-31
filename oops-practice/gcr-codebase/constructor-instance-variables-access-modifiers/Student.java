package level_1;
public class Student {
	public int rollNumber;
	protected String name;
	private double CGPA;
	public void setCGPA(double c) {
		CGPA = c;
	}
	public double getCGPA() {
		return CGPA;
	}
	public static void main(String[] args) {
		PostgraduateStudent p = new PostgraduateStudent();
		p.rollNumber = 10;
		p.name = "Ramu";
		p.setCGPA(9.5);
		p.getrollNumber();
		p.getname();
		
		System.out.println("CGPA: " + p.getCGPA());
	}
}
class PostgraduateStudent extends Student{
	public void getrollNumber(){
		System.out.println("Roll Number: " + rollNumber);
	}
	public void getname() {
		System.out.println("Name: " + name);
	}
}

