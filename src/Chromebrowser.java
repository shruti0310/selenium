import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","//Users//shruti.agrawal//documents//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		// driver.get does not store history.
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.navigate().to("https://yahoo.com");
		driver.navigate().back();
		
	
	}

}
