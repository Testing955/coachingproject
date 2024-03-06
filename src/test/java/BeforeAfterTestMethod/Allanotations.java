package BeforeAfterTestMethod;

import org.testng.annotations.*;

public class Allanotations 
{
@BeforeSuite
void BS()
{
System.out.println("This suite will run before suite");
}
@AfterSuite
void AS()
{
System.out.println("This suite will run after suite");
}
@BeforeTest
void Bt()
{
System.out.println("This test will run before test");
}
@AfterTest
void At()
{
System.out.println("This test will run after test");
}
@BeforeClass
void BC()
{
System.out.println("This will run before class");
}
@AfterClass
void AC()
{
System.out.println("This will run after class");
}
@BeforeMethod
void BM()
{
System.out.println("This will before method");
}
@AfterMethod
void AM()
{
System.out.println("This will run after method");
}
@Test(priority=1)
void test1()
{
System.out.println("Test 1");
}
@Test(priority=2)
void test2()
{
System.out.println("Test 2");
}
}
