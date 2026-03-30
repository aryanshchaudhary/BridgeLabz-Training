package resume_screening_system;

class ResumeScreener {
	public static <T extends JobRole> void screenResume(Resume<T> resume) {
        System.out.println("Screening resume for: " + resume.getDetails());
    }
}
