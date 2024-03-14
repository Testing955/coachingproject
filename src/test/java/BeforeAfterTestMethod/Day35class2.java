package BeforeAfterTestMethod;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day35class2 
{
	@Test
	void login()
	{
		System.out.println("Testing from class2........");
	}
	@AfterTest
	void abc()
	{
	System.out.println("Testing after test method..........");
	}
}
