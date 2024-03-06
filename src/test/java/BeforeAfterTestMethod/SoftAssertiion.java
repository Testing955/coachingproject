package BeforeAfterTestMethod;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertiion 
{
//@Test
void hardassertion()
{
System.out.println("Testing...........");
System.out.println("Testing...........");
System.out.println("Testing...........");
Assert.assertEquals(10,1);
System.out.println("Hard Assertion vs Soft Assertion");
}
@Test
void softassert()
{
	
	System.out.println("Testing...........");
	System.out.println("Testing...........");
	System.out.println("Testing...........");
	SoftAssert sa = new SoftAssert(); 
	sa.assertEquals(10,1);
	System.out.println("Hard Assertion vs Soft Assertionall");
	sa.assertEquals(1,1);
	sa.assertAll();   //this statement is used to verify whether the test is pass or not, it is mandatory
}
}

