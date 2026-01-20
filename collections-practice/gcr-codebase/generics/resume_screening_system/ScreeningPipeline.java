package resume_screening_system;
import java.util.List;

class ScreeningPipeline {

    public void processAllResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Processing role: " + role.getRoleName());
        }
    }
}
