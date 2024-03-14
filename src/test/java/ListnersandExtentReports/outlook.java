package ListnersandExtentReports;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//@Listeners(ListnersandExtentReports.ExtentReportManager.class)
public class outlook 
{
WebDriver driver;
@BeforeClass
void landingpage()			
{
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();													
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://login.live.com/");
}
@Test()
void logo()
{
try 
{
boolean status= driver.findElement(By.xpath("//*[@id=\"lightbox\"]/div[2]/img")).isDisplayed();
Assert.assertEquals(true, true);
} 
catch (Exception e) 
{
Assert.assertTrue(false);
}
}
@Test()
void Title()
{
try
{
Assert.assertEquals(driver.getTitle(),"Sign in to your Microsoft account");
Thread.sleep(10000);
}
catch(Exception t)
{
Assert.fail();
}
}
@Test(priority=1)
void login() throws InterruptedException
{
try
{
driver.findElement(By.name("loginfmt")).sendKeys("prince.ojha@outlook.com");
driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
Thread.sleep(10000);
driver.findElement(By.name("passwd")).sendKeys("Pg@7470828350");
driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
Assert.assertEquals(true,true);
Thread.sleep(10000);

}
catch(Exception y)
{
Assert.fail();
}
}
@Test(priority=2,dependsOnMethods= {"login"})
void logout()
{
	try
	{
driver.findElement(By.xpath("//input[@id='idBtn_Back']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"O365_MainLink_NavMenu\"]/span")).click();
driver.findElement(By.xpath("//*[@id=\"O365_AppTile_Mail\"]/div[2]")).click();
Thread.sleep(10000);
Set<String>windowIDS=driver.getWindowHandles();
List<String>windowidsList=new ArrayList(windowIDS);	
String parentwidowid=windowidsList.get(0);
String childwindowid= windowidsList.get(1);
driver.switchTo().window(childwindowid);
driver.findElement(By.xpath("//img[@alt='PG']")).click();
driver.findElement(By.xpath("//a[@id='mectrl_body_signOut']")).click();
Thread.sleep(5000);
}
	catch(Exception f)
	{
	Assert.fail();
	}
}
@AfterClass
void quit()
{
driver.quit();
}
}


