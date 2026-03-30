package university_course_management;
import java.util.ArrayList;
import java.util.List;

public class UniversitySystem {
	public static void main(String[] args) {

        Course<ExamCourse> math =
                new Course<>("Mathematics", new ExamCourse());

        Course<AssignmentCourse> cs =
                new Course<>("Computer Science", new AssignmentCourse());

        Course<ResearchCourse> phd =
                new Course<>("PhD Research", new ResearchCourse());

        System.out.println("Course Details:");
        System.out.println(math.getDetails());
        System.out.println(cs.getDetails());
        System.out.println(phd.getDetails());

        List<CourseType> courseTypes = new ArrayList<>();
        courseTypes.add(new ExamCourse());
        courseTypes.add(new AssignmentCourse());
        courseTypes.add(new ResearchCourse());

        Department dept = new Department();
        System.out.println("\nEvaluation Types Offered:");
        dept.displayCourses(courseTypes);
    }
}
