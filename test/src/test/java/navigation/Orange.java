package navigation;

import java.time.Duration;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.findElement(By.xpath("//*[contains(text(),'Username')]//following::input[1]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[1]/a/span")).click();
		
		driver.findElement(By.xpath("//*[@class='orangehrm-header-container']/button")).click();
		
		driver.findElement(By.xpath("//*[contains(text(),'User Role')]//following::div[4]")).sendKeys(Keys.DOWN, Keys.ENTER);
		
		
		driver.findElement(By.xpath("//*[contains(text(),'Employee Name')]//following::input")).sendKeys("virat");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Employee Name')]//following::input")).sendKeys(Keys.DOWN, Keys.ENTER);

		driver.findElement(By.xpath("//*[contains(text(),'Status')]//following::div[4]")).sendKeys(Keys.DOWN, Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Username')]//following::input[1]")).sendKeys("TCStata");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'Password')]//following::input")).sendKeys("Shubham@1234");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'Confirm Password')]//following::input")).sendKeys("Shubham@1234");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='oxd-form-actions']//button[2]")).click();
	
		Thread.sleep(5000);
		
		
		WebElement ELE = driver.findElement(By.xpath("//*[contains(text(),'TCStata')]/../preceding-sibling::div//span"));
		new Actions(driver).scrollToElement(ELE).perform();
		Thread.sleep(4000);
		ELE.click();
		//Thread.sleep(4000);
		
	//	driver.findElement(By.xpath("//*[text()='King Kohli']//preceding::input[1]")).click();
		
	}

}
