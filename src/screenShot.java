import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class screenShot {
    @Test
	public void captureScreenshot() throws Throwable {
    	System.setProperty("webdriver.chrome.driver","//Users//shruti.agrawal//documents//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("learn automation");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		//takescreenshot is a interface we cannot create object for it.
		//so we are type casting webdriver instance with takescreenshot
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		// here we are specifying the output type needs to be a file and storing it in source
		// file is a class
		//this will capture the screenshot 
		
	    FileHandler.copy(source,new File("./Screenshots/facebook.png"));
	    
	    //filehandler is a class
	    //screenshot will be in memory or buffer so we need to copy it to a particular format
	    
	    System.out.println("screenshot captured");
		
		
		
	}
}


// we can create library for the 4 lines of the code.
//The method should be static so that we dnt need to create the object for the new class which will
// contain this code.
//if we need to set screenshot name as separate then pass this as paramter besides driver in the static method.
