package Parellettesting;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paramtest 
{
WebDriver driver;
@BeforeClass
@Parameters({"browser"})
void redirectpage(String br) throws InterruptedException
{
	if(br.equals("chrome"))
	{
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
Thread.sleep(5000);
	}
	else if(br.equals("edge"))
	{
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	}
	else
	{
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	}
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://urbansoccermanager-stag.hestalabs.com/");
driver.manage().window().maximize();
}
@Test(priority=1)
void logo()
{
try
{
boolean status = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div[2]/img")).isDisplayed();
Assert.assertEquals(status, true);
}
catch(Exception e)
{
Assert.fail();
}
}
@Test(priority=2)
void title()
{
assertEquals(driver.getTitle(),"SoccerScoreboard");
}
@AfterClass
void close()
{
driver.quit();
}
}