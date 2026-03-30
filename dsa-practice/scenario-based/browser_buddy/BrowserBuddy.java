package browser_buddy;

import java.util.Stack;

public class BrowserBuddy {
	private Stack<Tab> closedTabs = new Stack<>();
	private Tab currentTab = new Tab();

	public void open(String url) {
		currentTab.visit(url);
	}

	public void back() {
		currentTab.back();
	}

	public void forward() {
		currentTab.forward();
	}

	public void closeTab() {
		closedTabs.push(currentTab);
		currentTab = new Tab();
		System.out.println("Tab closed");
	}

	public void restoreTab() {
		if (closedTabs.isEmpty()) {
			System.out.println("No tabs to restore");
		} else {
			currentTab = closedTabs.pop();
			System.out.println("Tab restored. Current page: " + currentTab.getCurrentPage());
		}
	}

	public void showCurrentPage() {
		System.out.println("Current Page: " + currentTab.getCurrentPage());
	}
}
