package level_2;
import java.util.*;
public class Frequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int[] freq = new int[10];
		while(num!=0) {
			freq[num%10]++;
			num/=10;
		}
		for(int i = 0; i<10;i++)
			if(freq[i]>0) {
				System.out.println(i + " occurs " + freq[i] + " times");
			}		
		sc.close();
	}
}
