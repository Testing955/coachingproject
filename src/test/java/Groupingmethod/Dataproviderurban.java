package Groupingmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataproviderurban 
{
WebDriver driver;
@BeforeClass
void onboardingpage()
{
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();

}
@Test(dataProvider="dp")
void login(String email, String pwd)
{
	driver.manage().window().maximize();
	driver.get("https://urbansoccermanager-stag.hestalabs.com/");
driver.findElement(By.name("email")).sendKeys(email);
driver.findElement(By.name("password")).sendKeys(pwd);
driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
String exp_title="SoccerScoreboard";
String act_title=driver.getTitle();
Assert.assertEquals(exp_title, act_title);
}
@AfterClass
void close()
{
driver.close();
}
@DataProvider(name="dp")
String [][] createdata()
{
		String data[][]=
			{
	{"admin@urbansoccermanager.com", "qwerty"},
	{"admin@urbansoccermanager.com", "Qwerty"}
	
	
};
		return data;
}
}
