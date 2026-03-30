package week_3;
import java.util.*;
class InvalidMarkException extends Exception {
    public InvalidMarkException(String msg) {
        super(msg);
    }
}

class Student {
    String name;
    String[] subjects;
    int[] marks;

    Student(String name, String[] subjects, int[] marks)
            throws InvalidMarkException {

        this.name = name;
        this.subjects = subjects;
        this.marks = marks;

        for (int m : marks) {
            if (m < 0 || m > 100) {
                throw new InvalidMarkException("Marks must be between 0 and 100");
            }
        }
    }

    double average() {
        int sum = 0;
        for (int m : marks) sum += m;
        return sum / (double) marks.length;
    }

    String grade() {
        double avg = average();
        if (avg >= 80) return "A";
        if (avg >= 60) return "B";
        if (avg >= 40) return "C";
        return "Fail";
    }

    void displayReport() {
        System.out.println("Report Card: " + name);
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
        System.out.println("Average: " + average());
        System.out.println("Grade: " + grade());
    }
}
public class StudentReportGenerator {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

        try {
            students.add(new Student(
                    "Rahul",
                    new String[]{"Math", "Science", "English"},
                    new int[]{75, 80, 70}
            ));

            for (Student s : students) {
                s.displayReport();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}
}
