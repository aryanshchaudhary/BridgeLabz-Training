package job_portal_resume_system;

import java.util.*;

public class Resume {
	private String candidateName;
	private Set<String> skills;
	private int matchScore;

	public Resume(String candidateName, Set<String> skills) throws InvalidResumeException {
		if (skills == null || skills.isEmpty()) {
			throw new InvalidResumeException("Skills cannot be empty");
		}
		this.candidateName = candidateName;
		this.skills = skills;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public Set<String> getSkills() {
		return skills;
	}

	public void setMatchScore(int score) {
		this.matchScore = score;
	}

	public int getMatchScore() {
		return matchScore;
	}
	
	@Override
	public String toString() {
		return candidateName + " | Match Score: " + matchScore;
	}
}
