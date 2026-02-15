package online_course_enrollment_manager.model;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        List<Enrollment> enrollmentList = Arrays.asList(
                new Enrollment("Aryan", "Java Programming", "Programming",
                        LocalDate.of(2025, 2, 10)),
                new Enrollment("Rahul", "Python Basics", "Programming",
                        LocalDate.of(2025, 2, 12)),
                new Enrollment("Sneha", "Digital Marketing", "Marketing",
                        LocalDate.of(2025, 2, 8)),
                new Enrollment("Amit", "Java Programming", "Programming",
                        LocalDate.of(2025, 2, 15)),
                new Enrollment("Priya", "Graphic Design", "Design",
                        LocalDate.of(2025, 2, 11))
        );

        EnrollmentService service = new EnrollmentService(enrollmentList);

        System.out.println("Filter by Course");
        service.filterByCourse("Java Programming")
                .forEach(System.out::println);

        System.out.println("\nFilter by Category");
        service.filterByCategory("Programming")
                .forEach(System.out::println);

        System.out.println("\nGroup by Course Name");
        service.groupByCourseName()
                .forEach((course, list) -> {
                    System.out.println(course);
                    list.forEach(System.out::println);
                });

        System.out.println("\nCount by Category");
        service.countByCategory()
                .forEach((category, count) ->
                        System.out.println(category + " : " + count));

        System.out.println("\nSorted by Enrollment Date");
        service.sortByEnrollmentDate()
                .forEach(System.out::println);
    }
}
