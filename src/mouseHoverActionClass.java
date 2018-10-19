import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHoverActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","//Users//shruti.agrawal//documents//chromedriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.yahoo.com/");
		
		driver.findElement(By.id("uh-signin")).click();
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.id("persistent"))).click().build().perform();
		
		
	}

}
