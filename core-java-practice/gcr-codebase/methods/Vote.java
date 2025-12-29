package level_2;
import java.util.*;
public class Vote {
	public boolean canStudentVote(int age){
		if(age<0) return false;
		return age>=18;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vote svc = new Vote();
		int[] ages = new int[10];
		for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            System.out.println(
                svc.canStudentVote(ages[i]) ? "Can Vote" : "Cannot Vote"
            );
        }
		sc.close();
	}
}
