package Testngproject;

import org.testng.annotations.*;

public class BeforeAfterMethod 
{
@BeforeMethod
void login()
{
System.out.println("Login...........");	
}
@Test(priority=1)
void search()
{
	System.out.println("Search...........");	
}
@Test(priority=2)
void Advancedsearch()
{
	System.out.println("Advanced search...........");	
}
@AfterMethod
void logout()
{
	System.out.println("Logout...........");	
}
}
