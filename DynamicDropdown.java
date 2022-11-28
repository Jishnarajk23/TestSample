package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdown {
	@Test
	public void DynamicDropdownImplementation() {
	WebDriver driver= WebDriverManager.chromedriver().create();
	driver.get("https://selenium.obsqurazone.com/jquery-select.php");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//span[@class='select2-selection_rendered'])[1]")).click();
	List<WebElement> DropsValues=driver.findElements(By.xpath("//li[@role='option']"));
	for(WebElement opt:DropsValues)
	{
		System.out.println("Opt: "+opt+" value:"+opt.getText());
	}
	}

}
