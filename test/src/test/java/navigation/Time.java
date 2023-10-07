package navigation;

import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//String eTitle = "IRCTC Next Generation eTicketing System";
		//String aTitle = " ";
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//ul[contains(@class,'oxd-main-menu')]/li/a/span")).click();
		//driver.findElement(By.xpath("//div[@class='oxd-table-body']//span/i")).click();
		driver.findElement(By.xpath("//*[@class='orangehrm-paper-container']//button[@type='button']")).click();
		
		//driver.findElement(By.xpath("//*[text()='User Role']//following::div[4]")).click();
		//driver.findElement(By.xpath("//*[text()='User Role']//following::div[4]")).sendKeys(Keys.END);
		//driver.findElement(By.xpath("//*[text()='User Role']//following::div[4]")).sendKeys(Keys.);

		WebElement drop=driver.findElement(By.xpath("//*[text()='User Role']//following::div[4]"));
		Select value= new Select(drop);
		value.getAllSelectedOptions();
		//Select s = new Select(v);
		//se.selectByIndex(1);
		
		//driver.findElement(By.xpath("//*[text()='User Role']//following::select[1]"));
		
		
		//WebElement firstResult=new WebDriverWait(driver, Duration.ofSeconds(2)).
			//	until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
		//System.out.println(firstResult.getText());
		//firstResult.click();
		//driver.findElement(By.xpath("//*[@class='M6CB1c rr4y5c']")).click();
		//driver.findElement(By.xpath("//*[@data-ved=\"0ahUKEwj16PeJ6fyAAxUrcPUHHeXbC5QQ4dUDCA4\"]")).click();
		
		
		//driver.manage().window().maximize();
		//get the actual title
		//aTitle = driver.getTitle();
		//compare the actual title with the expected title
		
		//driver.close();
		
		
		
		
		

	}

}
