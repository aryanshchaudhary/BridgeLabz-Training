package week_8;
public class Base7_504 {
	public String convertToBase7(int num) {
		if(num < 0) {
			return "-" + convertToBase7(-num);
		}
		if(num < 7) {
			return String.valueOf(num);
		}
		return convertToBase7(num / 7) + (num % 7);
	}
	public static void main(String[] args) {
		Base7_504 solution = new Base7_504();

        int num1 = 100;
        int num2 = -7;
        int num3 = 0;

        System.out.println("Base 7 of 100: " + solution.convertToBase7(num1));
        System.out.println("Base 7 of -7: " + solution.convertToBase7(num2));
        System.out.println("Base 7 of 0: " + solution.convertToBase7(num3));
	}
}
