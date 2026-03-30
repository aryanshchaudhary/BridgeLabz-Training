//package level_1;
//public class Book3 {
//    public String ISBN;
//    protected String title;
//    private String author;
//    public void setAuthor(String a) {
//        author = a;
//    }
//    public String getAuthor() {
//        return author;
//    }
//    public static void main(String[] args) {
//        EBook e = new EBook();
//        e.ISBN = "123";
//        e.title = "Java";
//        e.setAuthor("James");
//
//        System.out.println(e.ISBN + " " + e.title + " " + e.getAuthor());
//    }
//}
//class EBook extends Book3 {
//}

package level_1;
public class Book3 {
	public String ISBN;
	protected String title;
	private String author;
	
	public void setAuthor(String a) {
		author = a;
	}
	public String getAuthor() {
		return author;
	}
	public static void main(String[] args) {
		EBook e = new EBook();
		e.ISBN = "123";
		e.title = "Java";
		e.setAuthor("James");
		e.getISBN();
		e.getTitle();
		System.out.println("Author: " + e.getAuthor());
	}
}
class EBook extends Book3{
	public void getISBN() {
	    System.out.println("ISBN: " + ISBN);
	}
	public void getTitle() {
	    System.out.println("Title: " + title);
	}
}