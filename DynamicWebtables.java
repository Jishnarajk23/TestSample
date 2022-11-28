package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebtables {
	@Test
	public void getTables() throws InterruptedException
	{
		WebDriver driver= WebDriverManager.chromedriver().create();
	    driver.get("http://demo.guru99.com/test/web-table-element.php");
	    driver.manage().window().maximize();
	    List <WebElement> col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " +col.size()); 
        //No.of rows 
        List <WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
        System.out.println("No of rows are : " + rows.size());
        Assert.assertEquals(26, rows.size());
        
        WebElement table = driver.findElement(By.tagName("table"));
        //To find third row of table
		WebElement tableRow = table.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
        String rowtext = tableRow.getText();
		System.out.println("Third row of table : "+rowtext);
		    
		 // 3rd row's 3 rd column data
		 WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[3]"));
		 String valueIneed = cellIneed.getText();
		 System.out.println("Cell value is : " + valueIneed); 
		 Assert.assertTrue(valueIneed.equals("83.1"));

       // Thread.sleep(200);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
