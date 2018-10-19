import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class faceBookDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
		WebElement month_dropdown = driver.findElement(By.id("month"));
		
		
		Select month_dd = new Select(month_dropdown);
		// creating object of select class
        //month_dd.selectByValue("2");
		
		//month_dd.selectByVisibleText("Aug");
		
		month_dd.selectByIndex(3);
		
		Thread.sleep(3000);
		
		WebElement selectedvalue = month_dd.getFirstSelectedOption();
		
		String TextOfSelectedValue = selectedvalue.getText();
		
		System.out.println(TextOfSelectedValue);

		// get the count of elements in dropdown
		
		List <WebElement> listOfElement = month_dd.getOptions();
		
		int totalElements = listOfElement.size();
		
		
		
		System.out.println(totalElements);
		
		for (WebElement element:listOfElement)
		{
			String month_name = element.getText();
			System.out.println(month_name);
		}
				
				
		
				

	}

}
