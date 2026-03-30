package level_1;

public class DividePen {

	public static void main(String[] args) {
		int Pens = 14;
		int Student = 3;
		int Pen_Recieved = Pens/Student;
		int Rem_Pen = Pens%Student;
		System.out.println("The Pen Per Student is " + Pen_Recieved + 
				" and the remaining pen not distributed is " + Rem_Pen);
	}
}
