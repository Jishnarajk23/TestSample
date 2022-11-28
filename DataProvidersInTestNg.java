package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DataProvidersInTestNg 
{
	//@Test(dataProvider="GetLogindetails")
	@Parameters({"UserName,Password"})
	@Test
	public void DataProviderSample(String userName,String password) throws InterruptedException
	{
	WebDriver driver= WebDriverManager.chromedriver().create();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("user-name")).click();
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(userName);
	driver.findElement(By.name("password")).click();
	driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(password);
	Thread.sleep(5000);
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(5000);
	}
	
	/*@DataProvider
	public Object[][] GetLogindetails()
	{
		Object[][] data= new Object[3][2];
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";
		data[1][0]="locked_out_user";
		data[1][1]="secret_sauce";
		data[2][0]="problem_user";
		data[2][1]="secret_sauce";
		return data;
				
	}
	*/
	
}
