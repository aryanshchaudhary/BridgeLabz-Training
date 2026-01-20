package browser_buddy;

public class Tab {
	private History current;
	
	public void visit(String url) {
		History newHistory = new History(url);
		if (current != null) {
			current.next = newHistory;
			newHistory.prev = current;
		}
		current = newHistory;
		
		System.out.println("Visited: " + url);
	}
	
	public void back() {
		if (current != null && current.prev != null) {
			current = current.prev;
			System.out.println("Went back to: " + current.url);
		} else {
			System.out.println("No previous page");
		}
	}
	
	public void forward() {
		if (current != null && current.next != null) {
			current = current.next;
			System.out.println("Went forward to: " + current.url);
		} else {
			System.out.println("No next page");
		}
	}
	
	public String getCurrentPage() {
		return current != null ? current.url : "No page visited";
	}
}
