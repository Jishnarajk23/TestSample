package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebelementsSample 
{
	@Test
	public void Webelements() throws InterruptedException
	{
	WebDriver driver= WebDriverManager.chromedriver().create();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	List<WebElement> listOfElements = driver.findElements(By.className("nav-item"));
	System.out.println(listOfElements.toArray().length);
	
	}
}
