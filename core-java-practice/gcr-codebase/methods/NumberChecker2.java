package level_3;
import java.util.*;
public class NumberChecker2 {
	static int countDigits(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		return count;
	}
	static int[] getDigits(int num) {
		int count = countDigits(num);
		int[] digits = new int[count];
		for(int i=count-1; i>=0;i--) {
			digits[i]=num%10;
			num/=10;
		}
		return digits;
	}
	static int sumDigits(int[] digits) {
		int sum=0;
		for(int d:digits) {
			sum+=d;
		}
		return sum;
	}
	static int sumSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }
	static boolean isHarshad(int num, int[] digits) {
		int sum=sumDigits(digits);
		return num%sum==0;
	}
	static int[][] Frequency(int[] digits){
		int[][] freq=new int[10][2];
		for(int i=0;i<10;i++) {
			freq[i][0]=i;
			freq[i][1]=0;
		}
		for(int d:digits) {
			freq[d][1]++;
		}
		return freq;
	}
	static void displayFrequency(int[][] freq) {
		System.out.println("\nDigit\tFrequency");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0)
                System.out.println(freq[i][0] + "\t" + freq[i][1]);
        }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int[] digits = getDigits(num);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of Digits: " + sumDigits(digits));
        System.out.println("Sum of Squares: " + sumSquares(digits));
        System.out.println("Harshad Number: " + isHarshad(num, digits));
        int[][] freq = Frequency(digits);
        displayFrequency(freq);
		sc.close();
	}
}
