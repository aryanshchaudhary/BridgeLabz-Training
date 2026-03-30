package l_2;
import java.util.*;
public class Sqrt_69 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int left = 1;
		int right = num;
		int ans = 0;
		while(left <= right ) {
			int mid = (left + right)/2;
			if(mid==num/mid) {
				ans = mid;
				break;
			}else if(mid>num/mid) {
				right = mid - 1;
			}else {
				ans = mid;
				left = mid + 1;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
