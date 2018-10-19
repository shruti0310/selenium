package Portal;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {

	WebDriver driver = new FirefoxDriver();
	Locators lc = new Locators();
	
    @Test
	public void demo() {	
    
		driver.get("");
		CommonLibrary.LoginFunction(driver,"","");		
	}
		
	@Test
	public void subscribers() throws Throwable {
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.findElement(By.xpath(lc.MAINSEARCH)).click();
		driver.findElement(By.className(lc.SEARCHSCREEN)).click();
		driver.findElement(By.id(lc.SEARCHBOX)).sendKeys("dribeqa+1397@gmail.com");
		driver.findElement(By.xpath(lc.SUBMIT_SELECTION)).click();
		driver.findElement(By.className(lc.SEARCH_SELECTION)).click();
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		String currentStatus = driver.findElement(By.xpath(lc.STATUS)).getText();
		System.out.println("Current Status of the User" + currentStatus);
		
		if(!currentStatus.equals("PENDING") ) {	
			Screenshot(driver,"Subscriber Status");	
			Assert.assertEquals(currentStatus,"PENDING", "Status of the subscriber is not pending");
		}
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(lc.REGISTRATION_SELECTION)).click();
		
		String headingRegisteration = driver.findElement(By.xpath(lc.REGISTRATION_HEADING)).getText();
		
		System.out.println("Heading of Complete Registrtaion screen is " + headingRegisteration);
		
		Assert.assertEquals(headingRegisteration, "Finish Subscriber Registration", "Heading of screen does not match");
		
		
        driver.findElement(By.id(lc.SUBSCRIBER_CPR_NUMBER)).sendKeys("1234567");
        driver.findElement(By.id(lc.SUBSCRIBER_LICENSE_NUMBER)).sendKeys("12345678");
        driver.findElement(By.id(lc.SUBSCRIBER_LICENSE_EXPIRATION_DATE)).sendKeys("12/12/2020");
        driver.findElement(By.id(lc.SUBSCRIBER_DOB)).sendKeys("12/12/1980");
        driver.findElement(By.name(lc.SUBSCRIBER_GENDER)).click();
        driver.findElement(By.id(lc.SUBSCRIBER_ADDRESS)).sendKeys("100 Test Street");
        driver.findElement(By.id(lc.SUBSCRIBER_CITY)).sendKeys("Austin");
        driver.findElement(By.id(lc.SUBSCRIBER_ZIPCODE)).sendKeys("78759");
        
        driver.findElement(By.id(lc.SUBSCRIBER_BILLING_ADDRESS)).sendKeys("100 Test Street");
        driver.findElement(By.id(lc.SUBSCRIBER_BILLING_CITY)).sendKeys("Atlanta");
        driver.findElement(By.id(lc.SUBSCRIBER_BILLING_ZIPCODE)).sendKeys("78750");
        
        driver.findElement(By.id(lc.SUBSCRIBER_CARDNUMBER)).sendKeys("4242424242424242");
        driver.findElement(By.id(lc.SUBSCRIBER_CARD_EXPIRATION)).sendKeys("11/2019");
        driver.findElement(By.id(lc.SUBSCRIBER_CARD_CVC)).sendKeys("112");
        
        Select dropdown = new Select( driver.findElement(By.id(lc.SUBSCRIBER_MEMBERSHIP_RATE)));
        dropdown.selectByValue("8d1d2c96-6d3e-4cf6-8dcc-88ef46769344");
                
        driver.findElement(By.xpath(lc.SUBSCRIBER_SUBMIT)).click();
        
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        
        String finalStatus = driver.findElement(By.xpath(lc.STATUS)).getText();
		System.out.println("Final Status of the User" + finalStatus);
		Assert.assertEquals(finalStatus,"MEMBER", "Membership process was not completed successfully");
        Screenshot(driver,"Completed Registeration");
                   
	}
	
	public static void Screenshot(WebDriver driver, String name) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(source,new File("./Screenshots/"+name+".png"));
        System.out.println("screenshot captured");
		
	}
	
}
