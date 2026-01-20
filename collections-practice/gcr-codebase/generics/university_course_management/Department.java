package university_course_management;
import java.util.List;

class Department {
	public void displayCourses(List<? extends CourseType> courseTypes) {
        for (CourseType ct : courseTypes) {
            System.out.println(ct.getEvaluationType());
        }
    }
}
