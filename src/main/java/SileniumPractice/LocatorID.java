package SileniumPractice;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorID {
	
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver ();
	
	//driver.get("https://demo.opencart.com/index.php?route=account/login");
	
	
	//1.id is always unique
		//driver.findElement(By.id("input-email")).sendKeys("Test2024@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("Test@1234");
	
	//2.name can be duplicate 

	    driver.get("https://demo.opencart.com/en-gb?route=account/register");
	   // driver.findElement(By.name("firstname")).sendKeys("Test");
		//driver.findElement(By.name("lastname")).sendKeys("Automation");
		
		
	//3.Class Name can be duplicate  -- many elements will have same Class Name
		
		//driver.findElement(By.className("form-control")).sendKeys("Testing");
		
	//4.Xpath  is not attribute : address of web element in HTML DOM
		
		//driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("testing");
		//driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Automation");
		
		//5.css
		//driver.findElement(By.cssSelector("#input-firstname")).sendKeys("testing");
		//driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Automation");
		
		
		//6.linkText (<a>
	    
		//driver.findElement(By.linkText("Login")).click();
		
	
		//7.partialLinkText
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8.tagName: html tag  --> incase of h tags --header tags --h1-6 (highest is h1)
		
		String header = driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);
		
		String User = "Automation"+ System.currentTimeMillis()+"@opencart.com";
		
		String User_new = "Automation"+UUID.randomUUID()+"@opencart.com";
		
		System.out.println(User);
		System.out.println(User_new);
		

		
	}

}
