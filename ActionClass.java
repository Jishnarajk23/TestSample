package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
	@Test
	public void clickInselenium() throws InterruptedException 
	{
		WebDriver driver= WebDriverManager.chromedriver().create();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	    WebElement AddToCart= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		Actions act= new Actions(driver);
		act.contextClick(AddToCart).perform();
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		act.doubleClick(AddToCart).perform();
	}

}
