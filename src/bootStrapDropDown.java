import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class bootStrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("menu1")).click();
		
		
		List <WebElement> dropDownList = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		
		for(int i=0;i>dropDownList.size();i++)
		{
			WebElement specificDropDownElement = dropDownList.get(i);
			String innertag = specificDropDownElement.getAttribute("innerHTML");
			
			if(innertag.contentEquals("JavaScript"))
			{
				specificDropDownElement.click();
				break;
			}
		}
		
		driver.quit();
		
		
		
		
		
	}
}

