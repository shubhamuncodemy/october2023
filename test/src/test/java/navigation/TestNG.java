package navigation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class TestNG {
	
	WebDriver driver;
	
	@Test
	public void open_the_url() {
		//login into the account
		//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Assert.assertEquals("https://www.google.com", "https://www.goooogle.com");
		//Assert.assertEquals("https://www.google.com", "https://www.gooogle.com");
		//declare the object first
		
	}
	
	/*@Test
	public void open_dashboard() throws InterruptedException {
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//driver.findElement(By.xpath("//ul[contains(@class,'oxd-main-menu')]/li/a/span")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//div[@class='oxd-table-body']//span/i")).click();
		//driver.findElement(By.xpath("//*[@class='orangehrm-paper-container']//button[@type='button']")).click();
	}
	*/
	/*@Test(priority=1)
	public void login_with_credentials() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}*/
	
	
}
