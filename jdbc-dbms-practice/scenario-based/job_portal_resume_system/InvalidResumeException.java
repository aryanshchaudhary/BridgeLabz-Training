package job_portal_resume_system;

@SuppressWarnings("serial")
class InvalidResumeException extends Exception {
    public InvalidResumeException(String message) {
        super(message);
    }
}
