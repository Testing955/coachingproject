package PAGEOBJECTMODEL;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest 
{
WebDriver driver;
//Loginpage lp;
Loginpage2 lp;
@BeforeClass
void setup()
{
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://urbansoccermanager-stag.hestalabs.com/login");
}
@Test(priority=1)
void testlogo()
{
//lp=new Loginpage(driver);
lp=new Loginpage2(driver);
Assert.assertEquals(lp.checkLogoPresence(),true);
}
@Test(priority=2)
void login()
{
lp.setUserName("admin@urbansoccermanager.com");
lp.setPassword("qwerty");
lp.clickLogin();
Assert.assertEquals(driver.getTitle(),"SoccerScoreboard");
}
@AfterClass
void teardown()
{
driver.quit();
}

}
