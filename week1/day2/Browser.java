package week1.day2;

public class Browser {
	
	public String launchBrowser(String browserName) {
		
		System.out.println("Browser launched successfully : "+ browserName);
		return browserName;

	}
	
	public String loadUrl(String url) {
		
		System.out.println("Application url loaded successfully : "+ url);
		return url;

	}

	public static void main(String[] args) {
		
		Browser obj = new Browser();
		
		obj.launchBrowser("chrome");
		obj.loadUrl("ww.Chrometest.com");
		

	}

}
