package Testngproject;

import org.testng.annotations.*;

public class BeforeAfterClass 
{
@BeforeClass
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
@AfterClass
void logout()
{
	System.out.println("Logout...........");	
}
}
