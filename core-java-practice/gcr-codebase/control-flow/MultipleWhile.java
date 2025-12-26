package level_2;
import java.util.*;
public class MultipleWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int i = num;
		if (num>0 && num<100);
		while (i>=1) {
			if(num%i==0) {
				System.out.println(i);
			}
			i--;
		}
		sc.close();
	}
}
