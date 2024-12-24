package SileniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericGoogleSerach {

	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		
	 driver=new ChromeDriver();
	 driver.get("https://google.com");
	 
		By searchLocator=By.name("q");
		By searchSuggestions = By.xpath("//ul[@class=\"G43f7e\"]//div[@class=\"wM6W7d\"]/span");
		
		doSearch(searchLocator,searchSuggestions,"cigna calendar","year");
	}
	
	
		   public static void doSearch(By searchLocator ,By searchSuggestions ,String searchKey, String value ) throws InterruptedException{
			   driver.findElement(searchLocator).sendKeys(searchKey);
			   Thread.sleep(3000);
			   
			   List<WebElement> suggList = driver.findElements(searchSuggestions);
			   
			   for(WebElement e:suggList) {
					 String text = e.getText();
					
					 if( text.contains(value)) {
						e.click(); 
					 }
					 
				 }
			 
		 }

		   
		   
	

}
