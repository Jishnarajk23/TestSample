package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertInSelenium {
	@Test
	public void AlertinSe() throws InterruptedException
	{
	WebDriver driver= WebDriverManager.chromedriver().create();
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	driver.manage().window().maximize();
	driver.findElement(By.id("runbtn")).click();
	driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
	//driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	//Thread.sleep(3000);
	//driver.switchTo().alert().accept();
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
	driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
	driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	//Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.switchTo().alert().accept();
	
	}
	

}
