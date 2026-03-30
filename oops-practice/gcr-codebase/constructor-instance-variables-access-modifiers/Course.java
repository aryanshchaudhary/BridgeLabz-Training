package level_1;
public class Course {
	String courseName;
	int duration;
	double fee;
	static String instituteName = "GLA Institute";
	Course(String c, int d, double f){
		courseName = c;
		duration = d;
		fee = f;
	}
	void displayCourseDetails() {
		System.out.println(courseName + " " + duration + " " + fee + " " + instituteName);
	}
	static void updateInstituteName(String name) {
		instituteName = name;
	}
	public static void main(String[] args) {
		Course c = new Course("DSA", 3, 2000);
		c.displayCourseDetails();
		Course.updateInstituteName("Rajeev Academy");
		c.displayCourseDetails();
	}
}
