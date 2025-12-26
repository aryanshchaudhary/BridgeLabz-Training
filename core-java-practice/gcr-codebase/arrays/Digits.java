package level_2;
import java.util.*;
public class Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int maxDigit = 10;
		int[] digits = new int[maxDigit];
		int index = 0;
		while(num!=0 && index<maxDigit) {
			digits[index++]=num%10;
			num/=10;
		}
		int largest=0,secondLargest=0;
		for(int i = 0; i<index;i++) {
			if(digits[i]>largest) {
				secondLargest = largest;
				largest = digits[i];
			}else if(digits[i]>secondLargest && digits[i]!=largest) {
				secondLargest=digits[i];
			}
		}
		System.out.println("Largest: " + largest);
		System.out.println("Second Largest: " + secondLargest);
		sc.close();
	}
}
