package resume_screening_system;

class Resume<T extends JobRole> {
	private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public String getDetails() {
        return candidateName + " applying for " + jobRole.getRoleName();
    }
}
