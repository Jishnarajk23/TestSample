package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	@Test
	public void DragAndDropInSe()
	{
		WebDriver driver= WebDriverManager.chromedriver().create();
	    driver.get("https://demo.guru99.com/test/drag_drop.html");
	    driver.manage().window().maximize();
	    WebElement dragAmount=driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
	    WebElement dropPlace= driver.findElement(By.id("amt7"));
	    Actions act=new Actions(driver);
	    act.dragAndDrop(dragAmount, dropPlace).perform();
	}
}
