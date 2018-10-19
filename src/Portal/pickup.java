package Portal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class pickup {
	
	WebDriver driver = new FirefoxDriver();
    @Test
	public void demo() {	
		driver.get("https://dealer-portal-internal.staging.dribe.com/");
		LoginFunction(driver,"318f234f-99fd-4466-b6db-12d2fef5088c@mm.com","password");
		
    }
		
	public static void LoginFunction(WebDriver driver, String uNameTxt, String passTxt) {		
			WebElement userName=driver.findElement(By.id("email"));
			WebElement password = driver.findElement(By.id("password"));
			userName.sendKeys(uNameTxt);
			password.sendKeys(passTxt);
			WebElement loginButton = driver.findElement(By.className("Button__Ripple"));
			loginButton.click();
		}
	@Test	
	public void subscriptionPickup() {
		   driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		  // driver.findElement(By.xpath("//div[@class = 'DashboardItem__DashboardItem']/div/button/div[2]")).click();
	       driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/div/div[1]/div/div[2]/div/div[1]/div[2]/button[2]/div")).click();
	       
	     
	       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	       driver.findElement(By.xpath("//*[@id=\"pickup-scroll-container\"]/div[2]/div/div[1]/div[1]/div/div/button/div")).click();
	       
	       driver.findElement(By.xpath("//*[@id=\"pickup-scroll-container\"]/div[2]/div/div[1]/div[1]/div/div/div/div[1]/div")).click();
	       
	       
		
	}
		
	

}
