package level_2;
import java.util.*;
public class Marks {
	static int[][] marksPCM(int students){
		int[][] pcm = new int[students][3];
		for(int i=0;i<students;i++) {
			pcm[i][0] = 50+(int)(Math.random()*51);
			pcm[i][1] = 50+(int)(Math.random()*51);
			pcm[i][2] = 50+(int)(Math.random()*51);
		}
		return pcm;
	}
	static double[][] Scores(int pcm[][]){
		double data[][] = new double[pcm.length][3];
		for (int i = 0; i < pcm.length; i++) {
            double total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = Math.round((total / 3) * 100.0) / 100.0;
            double percent = Math.round((total / 300 * 100) * 100.0) / 100.0;
            data[i][0] = total;
            data[i][1] = avg;
            data[i][2] = percent;
        }
		return data;
	}
	static String grade(double percent) {
		if(percent>=80) return "A";
		if(percent>=70) return "B";
		if(percent>=60) return "C";
		if(percent>=50) return "D";
		if(percent>=40) return "E";
		return "R";
	}
	static void display(int[][] pcm, double[][] calc) {
		System.out.println("P\tC\tM\tTotal\tAvg\t%\tGrade");
	    for (int i = 0; i < pcm.length; i++) {
	    	System.out.printf("%d\t%d\t%d\t%.0f\t%.2f\t%.2f\t%s\n",
	    			pcm[i][0], pcm[i][1], pcm[i][2],
	                calc[i][0], calc[i][1], calc[i][2],
	                grade(calc[i][2]));
	    }
	}
	public static void main(String[] args) {
		int students = 5;
	    int[][] pcm = marksPCM(students);
	    double[][] calc = Scores(pcm);
	    display(pcm, calc);
	}
}
