package level_1;
public class NullPointException {
	static void generateException() {
		String text = null;
		System.out.println(text.length());
	}
	static void handleException() {
		try {
			generateException();
		} catch (NullPointerException e) {
			System.out.println("Exception Handled");
		}	
	}
	public static void main(String[] args) {
		handleException();
	}
}
    

   

