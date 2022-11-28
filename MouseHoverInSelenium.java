    package TestNG;
	import java.time.Duration;
import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class MouseHoverInSelenium {
		@Test
		public void ActionClassMouseHover() throws InterruptedException {
			WebDriver driver = WebDriverManager.edgedriver().create();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			//Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//button[@class ='_2KpZ6l _2doB4z']")).click();
			//Hovering electronics
		    WebElement ele = driver.findElement(By.xpath("//img[@alt = 'Electronics']"));
		    Actions act = new Actions (driver);
		    act.moveToElement(ele).perform();
		    //Thread.sleep(3000);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    //Hovering audio
		    WebElement ele1= driver.findElement(By.xpath("(//div[@class ='CXW8mj'])[5]"));
		    Actions act1 = new Actions (driver);
		    act1.moveToElement(ele1).perform();
		    //Thread.sleep(3000);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    //Sound bars click
		    driver.findElement(By.linkText("Soundbars")).click();
		    Thread.sleep(3000);
		    //To display the number of images
			List<WebElement> Options = driver.findElements(By.tagName("img"));
			//Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			int count = Options.size();
			System.out.println("The number of image displayed are " +count);
			Thread.sleep(3000);
		}

	}
