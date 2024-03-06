package Groupingmethod;

import org.testng.annotations.Test;

public class Groupbygroup 
{
@Test(priority=1,groups= {"sanity","regression"})
void loginbyemail()
{
System.out.println("Test is run by email");
}
@Test(priority=2,groups= {"sanity"})
void loginbyfacebook()
{
System.out.println("Test is run by facebooklogin");
}
@Test(priority=3,groups= {"sanity"})
void loginbytwitter()
{
System.out.println("Test is run by twitter");
}
@Test(priority=4,groups= {"sanity","regression"})
void singupbyemail()
{
System.out.println("Test is run by signup");
}
@Test(priority=5,groups= {"regression"})
void signupbyfacebook()
{
System.out.println("Signup by facebook");
}
@Test(priority=6,groups= {"regression"})
void signupbytwitter()
{
	System.out.println("Test is signup by twitter");
}
@Test(priority=7,groups= {"sanity","regression"})
void paymentinrupees()
{
System.out.println("Payent is in rupees");
}
@Test(priority=8,groups= {"sanity"})
void payemnetindollar()
{
System.out.println("Payment in dollar");
}
@Test(priority=9,groups= {"regression"})
void paymentinreturnbybank()
{

}
}
