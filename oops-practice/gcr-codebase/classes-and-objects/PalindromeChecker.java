package level_2;
public class PalindromeChecker {
	String text;
	boolean isPalindrome() {
        String remSpace = text.replaceAll("\\s+", "").toLowerCase();
        String rev = "";
        for (int i = remSpace.length() - 1; i >= 0; i--) {
            rev += remSpace.charAt(i);
        }
        return remSpace.equals(rev);
    }
    void display() {
        if (isPalindrome())
            System.out.println(text + " is palindrome");
        else
            System.out.println(text + " is not Palindrome");
    }
	public static void main(String[] args) {
		PalindromeChecker p1 = new PalindromeChecker();
        p1.text = "A man a plan a canal Panama";

        PalindromeChecker p2 = new PalindromeChecker();
        p2.text = "Hello";

        p1.display();
        p2.display();
	}
}
