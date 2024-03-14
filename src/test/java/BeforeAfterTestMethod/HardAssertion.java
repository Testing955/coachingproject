package BeforeAfterTestMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion 
{
@Test
void abc()
{
	/*int a = 20;
int b =30;
if(a==b)      //here we can't use direct if else statement 
{
System.out.println("Test is passed");
}
else
{
System.out.println("Test is failed");
}*/
//Assert.assertTrue(true);   pass
//Assert.assertFalse(false);  pass
	//int c = 120;
	//int e = 789;
	//Assert.assertEquals(c>e,true,"Test is failed");
	
	String S1="ABC";
	String S2="ABC";
	//String S2="ABC";
	//Assert.assertEquals(S1,S2, "String is not equal"); //Pass
	//Assert.assertEquals(S1,S2, "String is equal");
	
	if(false)
	{
	Assert.assertTrue(true);
	}
	else
	{
	//Assert.assertFalse(false);
	Assert.fail();
	}
	
}
}
