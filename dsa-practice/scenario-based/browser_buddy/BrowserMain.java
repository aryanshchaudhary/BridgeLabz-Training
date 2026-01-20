package browser_buddy;

public class BrowserMain {
	public static void main(String[] args) {
		BrowserBuddy browser = new BrowserBuddy();

        browser.open("google.com");
        browser.open("youtube.com");
        browser.open("github.com");

        browser.back();
        browser.back();
        browser.forward();

        browser.showCurrentPage();

        browser.closeTab();
        browser.restoreTab();
        browser.showCurrentPage();
	}
}
