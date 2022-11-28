package TestNG;
import org.testng.annotations.Test;

	public class HomeInsuranceTest {

		@Test(groups= {"SMK"})
		public void mobileLogin()
		{
			
		}
		
		@Test(groups= {"SMK"})
		public void mobileLogout() 
		{
			
		}
		
		@Test(groups= {"SMK"},dependsOnMethods={"webLogin"})
		public void webLogout() 
		{
			System.out.println("Web log out");
		}
		
		@Test(groups= {"SMK"}, enabled=true)
		public void webLogin() 
		{
			System.out.println("webLogin");
		}
		
	}
