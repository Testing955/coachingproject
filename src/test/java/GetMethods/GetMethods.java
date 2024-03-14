package GetMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException 
	{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://calendyze-frontend.hestawork.com/");
System.out.println("The current title of the page is: "+driver.getTitle());
System.out.println("The current Url of the page is: "+driver.getCurrentUrl());
Thread.sleep(10000);
/*System.out.println("Page Source...........");
String ps = driver.getPageSource();
System.out.println(ps);
System.out.println(ps.contains("html"));*/
//System.out.println(driver.getWindowHandle());
driver.findElement(By.xpath("//span[normalize-space()='Sign in with Google']")).click();
Set<String>windids=driver.getWindowHandles();
for(String winid:windids)
{
System.out.println(winid);
}
	}

}
