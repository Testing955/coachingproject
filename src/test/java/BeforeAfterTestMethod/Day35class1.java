package BeforeAfterTestMethod;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day35class1 
{
	@Test
void login()
{
System.out.println("Testing from class1........");
}
	@BeforeTest
	void xyz()
	{
	System.out.println("Testing before test Method.............");
	}
	@BeforeSuite
	void BS()
	{
	System.out.println("This before suite method");	
	}
	@AfterSuite
	void AS()
	{
	System.out.println("This is after suite method");
	}
}

