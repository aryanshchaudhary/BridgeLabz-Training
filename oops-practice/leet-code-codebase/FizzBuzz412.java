package leetcode;
import java.util.*;
public class FizzBuzz412 {
	public static List<String> fizzBuzz(int n){
		List<String> list = new ArrayList<String>();
		for(int i=1; i<=n; i++) {
			if(i%3==0 && i%5==0) {
				list.add("FizzBuzz");
			}else if (i%3==0) {
				list.add("Fizz");
			}else if (i%5==0) {
				list.add("Buzz");
			}else {
				list.add(String.valueOf(i));
			}
		}
		return list;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		System.out.println(fizzBuzz(n));
		sc.close();
	}
}
