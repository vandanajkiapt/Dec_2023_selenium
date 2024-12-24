package SileniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSuggestions {
	

	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
	
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
driver.findElement(By.name("q")).sendKeys("selenium");;
  Thread.sleep(3000);
  
//ul[@class="G43f7e"]//div[@class="wM6W7d"]/span
  

 List<WebElement> suggestionlist = driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]//div[@class=\"wM6W7d\"]/span"));
 
 System.out.println ( suggestionlist.size());
 
 for(WebElement e:suggestionlist) {
	 String text = e.getText();
	 System.out.println(text);
	 if( text.contains("python")) {
		e.click(); 
	 }
	 
 }
  
 
 
  

	}

}
