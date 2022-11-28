package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigators {

	@Test
	public void Navigation() throws InterruptedException 
	{
	WebDriver driver= WebDriverManager.chromedriver().create();
	driver.manage().window().maximize();
	driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
	//Thread.sleep(5000);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().back();
	//Thread.sleep(5000);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().forward();
	//Thread.sleep(5000);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().refresh();
	//Thread.sleep(5000);
	}

}
