package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightBooking {
	@Test
	public void flightBooking() throws InterruptedException
	{
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.booking.com/index.en-gb.html?label=gen173nr-1BCAEoggI46AdIM1gEaGyIAQGYAQm4ARfIAQzYAQHoAQGIAgGoAgO4AsvtzJsGwAIB0gIkYjI2NzI2YjYtN2Y0MS00OThhLWI0NDYtNmY1ODczZDM5NTMy2AIF4AIB&sid=85a1d08a5a19dcbbfead10b12d7ce334&keep_landing=1&sb_price_type=total&");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='bui-tab__link']")).click();
		
		Thread.sleep(1000);
		//driver.findElement(By.className("InputRadio-module__field___4Jbyo")).click();

		
		/*driver.findElement(By.cssSelector("input[placeholder='Where from?']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Where from?']")).sendKeys("CCJ kozhikode");*/
		
		/*driver.findElement(By.cssSelector("input[placeholder='Where to?']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Where to?']")).sendKeys("MAA Chennai");*/
	
		Thread.sleep(2000);
		Select select = new Select(driver.findElement(By.className("css-1k0jlfl")));  
		select.selectByVisibleText("Premium economy");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='input_occupancy_desktop_passengers_trigger']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-testid='input_occupancy_modal_adults_increase']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-testid='input_occupancy_modal_adults_increase']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-testid='input_occupancy_modal_children_increase']")).click();
		Select ageOfBaby=new Select(driver.findElement(By.className("InputSelect-module__field___wEAQl")));
		ageOfBaby.selectByVisibleText("3");
		
		//driver.findElement(By.xpath("//span[@class='Text-module__root--variant-body_2___-3fYM']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Depart']")).click();
		driver.findElement(By.xpath("//span[@data-date-cell='2022-12-20']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[placeholder='Return']")).click();
		driver.findElement(By.xpath("//span[@data-date='2022-12-15']")).click();
		
		driver.findElement(By.xpath("//button[@data-testid='searchbox_submit']")).click();
		driver.findElement(By.xpath("//span[@class='Text-module__root--variant-body_2___-3fYM']")).click();
		Thread.sleep(3000);
		
	}


}
