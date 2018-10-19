package Portal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CommonLibrary {
	
	public static void LoginFunction(WebDriver driver, String uNameTxt, String passTxt) {		
		WebElement userName=driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		userName.sendKeys(uNameTxt);
		password.sendKeys(passTxt);
		//WebElement loginButton = driver.findElement(By.className("Button__Ripple"));
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login\"]/div[3]/button[1]/div"));
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		loginButton.click();
		System.out.println("Logged In Successfully");
		String titleActual= driver.getTitle();	
	    System.out.println(" The title after login is " + titleActual);
		String titleExpected = "Dribe | Portal";
		Assert.assertEquals(titleActual,titleExpected, "Title of the page did not match");	
	}
	
	
}


