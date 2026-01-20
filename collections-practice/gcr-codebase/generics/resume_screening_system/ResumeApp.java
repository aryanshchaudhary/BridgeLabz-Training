package resume_screening_system;
import java.util.ArrayList;
import java.util.List;

public class ResumeApp {
	public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>("Amit", new SoftwareEngineer());

        Resume<DataScientist> r2 =
                new Resume<>("Neha", new DataScientist());

        Resume<ProductManager> r3 =
                new Resume<>("Rahul", new ProductManager());

        ResumeScreener.screenResume(r1);
        ResumeScreener.screenResume(r2);
        ResumeScreener.screenResume(r3);

        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        ScreeningPipeline pipeline = new ScreeningPipeline();
        pipeline.processAllResumes(roles);
    }
}
