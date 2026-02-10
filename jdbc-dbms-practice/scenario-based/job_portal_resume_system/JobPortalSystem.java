package job_portal_resume_system;

import java.util.*;

public class JobPortalSystem {
	public static void main(String[] args) {
		try {
			Set<String> requiredSkills = new HashSet<>();
			requiredSkills.add("Java");
			requiredSkills.add("Spring");
			requiredSkills.add("SQL");

			List<Resume> resumes = new ArrayList<>();

			resumes.add(new Resume("Aryansh", new HashSet<>(Arrays.asList("Java", "Spring", "SQL"))));
			resumes.add(new Resume("Satyarth", new HashSet<>(Arrays.asList("Java", "Spring"))));
			resumes.add(new Resume("Himanshu", new HashSet<>(Arrays.asList("Java", "SQL"))));
			for (Resume resume : resumes) {
				int matchCount = 0;
				for (String skill : requiredSkills) {
					if (resume.getSkills().contains(skill)) {
						matchCount++;
					}
				}
				resume.setMatchScore(matchCount);
			}
			resumes.sort(new Comparator<Resume>() {
				@Override
				public int compare(Resume r1, Resume r2) {
					return Integer.compare(r2.getMatchScore(), r1.getMatchScore());
				}
			});
			System.out.println("Shortlised Resumes:");
			for (Resume r : resumes) {
				System.out.println(r);
			}

		} catch (InvalidResumeException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
