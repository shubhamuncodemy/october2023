package navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

public class selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
	        driver.get("https://google.com");
	        driver.findElement(By.name("q")).sendKeys("mother");
	        Thread.sleep(2000);
	        driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//this code is used for to open the website in the browser
		/*driver.findElement(By.id("username")).sendKeys("practice");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("(//a)[13]")).click();
	*/

	}

}
