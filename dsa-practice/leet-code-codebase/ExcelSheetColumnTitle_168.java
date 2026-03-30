package week_3;
import java.util.*;
public class ExcelSheetColumnTitle_168 {
	public static String convertToTitle(int col){
		StringBuilder sb = new StringBuilder();
		while(col>0) {
			int r = (col-1)%26;
			sb.append((char)(r+'A'));
			col = (col-1)/26;
		}
		return sb.reverse().toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the column number : ");
		int n = sc.nextInt();
		System.out.println(convertToTitle(n));
		sc.close();
	}
}
