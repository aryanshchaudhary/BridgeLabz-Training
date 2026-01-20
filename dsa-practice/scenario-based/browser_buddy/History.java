package browser_buddy;

public class History {
	String url;
	History next;
	History prev;
	
	History(String url) {
		this.url = url;
		this.next = null;
		this.prev = null;
	}
}
