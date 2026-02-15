package online_course_enrollment_manager.model;

import java.util.*;
import java.util.stream.Collectors;

public class EnrollmentService {

    private List<Enrollment> enrollments;

    public EnrollmentService(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public List<Enrollment> filterByCourse(String courseName) {
        return enrollments.stream()
                .filter(e -> e.getCourseName().equalsIgnoreCase(courseName))
                .collect(Collectors.toList());
    }

    public List<Enrollment> filterByCategory(String category) {
        return enrollments.stream()
                .filter(e -> e.getCourseCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public Map<String, List<Enrollment>> groupByCourseName() {
        return enrollments.stream()
                .collect(Collectors.groupingBy(Enrollment::getCourseName));
    }

    public Map<String, Long> countByCategory() {
        return enrollments.stream()
                .collect(Collectors.groupingBy(
                        Enrollment::getCourseCategory,
                        Collectors.counting()
                ));
    }

    public List<Enrollment> sortByEnrollmentDate() {
        return enrollments.stream()
                .sorted(Comparator.comparing(Enrollment::getEnrollmentDate))
                .collect(Collectors.toList());
    }
}
