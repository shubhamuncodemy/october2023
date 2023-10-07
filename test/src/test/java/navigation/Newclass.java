package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;

public class Newclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Options object_name =driver.manage();
		//object_name.window().maximize();
		//object_name.window().minimize();
		
		//opt.window().minimize();
		//object_name.window().fullscreen();
		driver.manage().window().setSize(new Dimension(2000,2000));
		//for checking the responsiveness of the website 
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		

	}

}
