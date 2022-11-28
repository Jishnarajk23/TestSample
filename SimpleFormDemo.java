package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleFormDemo {
	@Test
	public void SimpleFormDemoSample() throws InterruptedException 
	{
		WebDriver driver= WebDriverManager.chromedriver().create();
		// Get url.
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		/*
		// Click on Simple form demo.
		driver.findElement(By.linkText("Simple Form Demo")).click();
		driver.findElement(By.id("single-input-field")).click();
		String jishna="jishna";
		// Enter input.
		driver.findElement(By.id("single-input-field")).sendKeys(jishna);
		driver.findElement(By.id("button-one")).click();
		WebElement message=driver.findElement(By.id("message-one"));
		// Get the text from web element.
		String str=message.getText();
		String replacedString=str.replace("Your Message : ","");
		Assert.assertTrue(replacedString.equals(jishna));
		Thread.sleep(5000);
		
		// FORM 1.Add two numbers.
		driver.findElement(By.id("value-a")).sendKeys("10");
		driver.findElement(By.id("value-b")).sendKeys("20");
		driver.findElement(By.id("button-two")).click();
		Thread.sleep(5000);
		WebElement messageTwo =driver.findElement(By.id("message-two"));
		String expectedValue="30";
		String sumValue=messageTwo.getText();
		Assert.assertTrue(expectedValue.equals(sumValue.replace("Total A + B : ","")));
		Thread.sleep(5000);
		
		// Form 2. Check box click
		driver.findElement(By.linkText("Checkbox Demo")).click();
		driver.findElement(By.id("gridCheck")).click();
		WebElement messageCheckbox =driver.findElement(By.id("message-one"));
		String expectedCheckboxValue="Success - Check box is checked";
		String checkBoxValue=messageCheckbox.getText();
		Assert.assertTrue(expectedCheckboxValue.equals(checkBoxValue));
		Thread.sleep(5000);	
		
		// Form 2. Select all click
		driver.findElement(By.id("button-two")).click();
		WebElement selectAll =driver.findElement(By.id("is_checked"));
		String expectedSelectAllValue=selectAll.getAttribute("value");
		Assert.assertTrue(expectedSelectAllValue.equals("true"));
		Thread.sleep(5000);
		
		*/
		//driver.findElement(By.linkText("Radio Buttons Demo")).click();
		//WebElement radiobutton =driver.findElement(By.id("inlineRadio1"));
		//radiobutton.click();
		/*driver.findElement(By.id("button-one")).click();
		WebElement messageRadio =driver.findElement(By.id("message-one"));
		String content=messageRadio.getText();
		Assert.assertTrue(content.contains("Male"));
		Thread.sleep(5000);
		*/
		//driver.findElement(By.id("inlineRadio11")).click();
		//driver.findElement(By.id("inlineRadio22")).click();
		//driver.findElement(By.id("button-two")).click();
		//WebElement messagetwo =driver.findElement(By.id("message-two"));
		//String content1=messagetwo.getText();
		//single-input-field
		//messagetwo.getAttribute()
		//Assert.assertTrue(content1.contains("Male")&&content1.contains("1 to 18") );
		//Thread.sleep(5000);
		WebElement element= driver.findElement(By.id("single-input-field"));
		System.out.println(element.getAttribute("id"));
		System.out.println(element.getSize());
		System.out.println(element.getLocation());
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
}
