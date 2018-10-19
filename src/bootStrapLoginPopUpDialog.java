import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootStrapLoginPopUpDialog {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","//Users//shruti.agrawal//documents//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("get_sign_up")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.switchTo().frame("authiframe");
	
	    driver.findElement(By.xpath("//input[@id='authMobile']")).sendKeys("9970286746");
		
		
		/* coming inside a frame so we need to switch to the frame by providing the frame id
		 * pop up dialog is part of the frame
		 * So in some applications there would be frame but in some frame will not be there so just using 
		 * locator strategy can be used
		 */
	 
	    

	}

}
