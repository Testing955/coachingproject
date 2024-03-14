package Testngproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Urbantestnglogin
{
WebDriver driver;
//@BeforeClass
@Test(priority=1)
void openapplication()
{
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://urbansoccermanager-stag.hestalabs.com/login");
}
@Test(priority=2)
void login()
{
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("admin@urbansoccermanager.com");	
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("qwerty");
	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div[1]/div/form/div[4]/div[1]/button")).click();
}
//@AfterClass
@Test(priority=3)
void logout() throws InterruptedException
{
	Thread.sleep(1000);
driver.findElement(By.xpath("//a[@id='logout_btn']")).click();
}
}
