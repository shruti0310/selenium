import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWait {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.xpath("//button[text ='Click me to start timer']")).click();
		
//		boolean status = driver.findElement(By.xpath("//p[text()='WebDriver'")).isDisplayed();
//		
//		if(status)
//		{
//			System.out.println("Test cases passed");
//		}
//		
//		else{
//			System.out.println("Test cases failed");
//		}
			
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver);

		
	}

}
