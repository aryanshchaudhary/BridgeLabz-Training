package edu_results;

public class EduResultsMain {
	public static void main(String[] args) {
		Student[] students = {
				new Student(78),
                new Student(85),
                new Student(62),
                new Student(90),
                new Student(55)
                };
		MergeSort.sort(students, 0, students.length - 1);
		
		System.out.println("Final State Rank List:");
		for (Student student : students) {
			System.out.println("Score: " + student.marks);
		}
	}
}
