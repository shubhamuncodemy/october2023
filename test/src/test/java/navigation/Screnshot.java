package navigation;

import java.time.Duration;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screnshot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nextsoftwaretesting.com");
		driver.manage().window().maximize();
		
		//File photo= TakeScreenshot(driver.getScreenshotAs.Output.File);
		File photo = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(photo, new File("C:\\seleniumScreenshot\\photo.png"));
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
	}

}
