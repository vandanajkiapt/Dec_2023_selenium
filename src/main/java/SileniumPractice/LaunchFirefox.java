package SileniumPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
driver.get("https://www.Google.com");
		
		String title = driver.getTitle();
		
		
		System.out.println("title of page is "+title);
		
		if (title.equals("Google")) {
			System.out.println("title is correct --pass ");	
			
			
		} else {
			System.out.println("title of incorrect -- fail");
		} 
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.contains("google.com")) {
			System.out.println("url is correct --pass ");	
			
		} else {
			
			System.out.println("url is  not correct --pass ");	

		}
		
		
		driver.close();
		
		
		
		
		
	}
}
