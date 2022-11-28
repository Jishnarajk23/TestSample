package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecution {
	@Test
	public void JavasriptExe() throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://login.yahoo.com/?.intl=in");
		driver.manage().window().maximize();
		// interface instance
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('hai')");
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().alert().accept();
		//Thread.sleep(2000);
		WebElement web = driver.findElement(By.id("persistent"));
		js.executeScript("arguments[0].click();", web);
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
