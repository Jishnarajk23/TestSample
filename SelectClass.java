package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass {
	@Test
	public void selectClass() throws InterruptedException 
	{	
	WebDriver driver= WebDriverManager.chromedriver().create();
	driver.get("https://selenium.obsqurazone.com/select-input.php");
	driver.manage().window().maximize();
	WebElement staticDropdown=driver.findElement(By.id("single-input-field"));
	Select select= new Select(staticDropdown);
	//driver.findElement(By.cssSelector())
	//driver.findElement(By.xpath("//option[@value='Yellow'][1]")).click();
	select.selectByIndex(1);
	//Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	select.selectByVisibleText("Yellow");
	//Thread.sleep(2000);
	select.selectByValue("Green");
	//Thread.sleep(2000);
	//select.deselectByIndex(3);
	//Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //Select selectNew= new Select(driver.findElement(By.id("select2-data-7-0xio")));
	Select selectNew= new Select(driver.findElement(By.id("multi-select-field")));
    selectNew.selectByIndex(1);
    selectNew.selectByIndex(2);
    selectNew.selectByIndex(3);
    driver.findElement(By.id("button-first")).click();
    driver.findElement(By.id("button-all")).click();
    WebElement messagetwo =driver.findElement(By.id("message-two"));
    
	String content1=messagetwo.getText();
	//String expectedValue="All selected colors are : Red";
	//Assert.assertTrue(expectedValue.equals(content1));
	
    
	//Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
