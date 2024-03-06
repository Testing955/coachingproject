package ListnersandExtentReports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Mytest 
{
@Test(priority=1)
void pass()
{
Assert.assertEquals(1,1);
}
@Test(priority=2)
void failed()
{
Assert.assertEquals(1,2);
}
@Test(priority=3,dependsOnMethods= {"failed"})
void skip()
{
Assert.assertEquals(1,1);
}
}
