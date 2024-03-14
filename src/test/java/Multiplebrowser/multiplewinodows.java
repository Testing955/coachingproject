package Multiplebrowser;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiplewinodows {

	public static void main(String[] args) 
	{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
Set<String>windowIDS=driver.getWindowHandles();
//Approach 1 using List methods
//Converting Set to List
/*List<String>windowidsList=new ArrayList(windowIDS);
String parentwidowid=windowidsList.get(0);
String childwindowid= windowidsList.get(1);
//Switching to child window
driver.switchTo().window(childwindowid);
driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[2]/a/button")).click();
//Switch to parent window
driver.switchTo().window(parentwidowid);
driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();*/

//Approach 2 Using for loop  Switching windows
/*for(String windids:windowIDS)
{
String title = driver.switchTo().window(windids).getTitle();
if(title.equals("OrangeHRM HR Software | OrangeHRM"))
{
driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[2]/a/button")).click();
}*/
/*else
{
	driver.switchTo().window(windids);
	title.equals("OrangeHRM");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
}
}*/
//Closing windows by our choice
for(String windids:windowIDS)
{
String title = driver.switchTo().window(windids).getTitle();
if(title.equals("//*[@id=\\\"navbarSupportedContent\\\"]/div[2]/ul/li[2]/a/button"))
{
driver.close();
}
}

}
}

