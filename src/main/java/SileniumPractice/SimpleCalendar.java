package SileniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleCalendar {

	static WebDriver driver ;
	
	public static void main(String[] args) {
	
		
	driver = new ChromeDriver();
	
 String ExpectedMonthYear = "January 2025";
	
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	
	driver.findElement(By.id("datepicker")).click();
	
		
	String ActualMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
	
	System.out.println(ActualMonthYear);
	
	
	while (!ActualMonthYear.equalsIgnoreCase(ExpectedMonthYear) ) {
	
		System.out.println(ActualMonthYear);
	    
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
	   
		ActualMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
	   
	 
	}
	
		
	driver.findElement(By.xpath("//a[text()='24']")).click();
		
		
		
		
		
	}
	
	
}
