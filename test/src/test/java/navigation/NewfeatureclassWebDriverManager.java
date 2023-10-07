package navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;

public class NewfeatureclassWebDriverManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Options object_name = driver.manage();
		//object_name.window().minimize();
		//object_name.window().fullscreen();
		object_name.window().setSize(new Dimension(1000,500));
		driver.get("https://www.google.com");
		

	}

}
