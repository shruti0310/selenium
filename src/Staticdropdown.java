import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","//Users//shruti.agrawal//documents//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.className("pax-add pax-enabled")).click();
		
	}

}
