package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Before test");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("After test");
	}
	
	@Test
	public void Test() 
	{
		System.out.println("Test");
	}
	
	@BeforeMethod
	public void method()
	{
		System.out.println("@BeforeMethod");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("@AfterMethod");
	}
	@AfterClass
    public void AfterClass() 
	{
		System.out.println("@AfterClass");
	}
	
	@BeforeClass
    public void BeforeClass() 
	{
		System.out.println("@BeforeClass");
	}
	
	@BeforeSuite
	public void BeforeSuite() 
	{
		System.out.println("@BeforeSuite");
	}
	
	@AfterSuite
	public void AfterSuite() 
	{
		System.out.println("@AfterSuite");
	}
	
	@Test(enabled=true)
	public void enabled()
	{ 
		System.out.println("@Enabled");	
	}
	
	@AfterGroups
	public void AfterGruop() 
	{
		System.out.println("@AfterGruop");
	}
	
	@BeforeGroups
	public void BeforeGroups() 
	{
		System.out.println("@BeforeGroups");
	}
	@Test(invocationCount=3)
	public void InvocationCount() 
	{
		System.out.println("Invocation Count");
	}

}
