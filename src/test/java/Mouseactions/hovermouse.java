package Mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hovermouse {

	public static void main(String[] args) throws InterruptedException 
	{
WebDriverManager.edgedriver().setup();
WebDriver driver;
driver = new EdgeDriver();
driver.get("https://www.myntra.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
//WebElement m = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a"));
WebElement w = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/a"));
Thread.sleep(3000);
//WebElement men =driver.findElement(By.xpath("//li/a[@class=\"desktop-categoryName\" and contains(text(), \"Topwear\")]\r\n"+ ""));
WebElement indian = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/div/div/div/li[1]/ul/li[1]/a"));
Thread.sleep(5000);
//WebElement size = driver.findElement(By.xpath("//*[@id=\"sizeButtonsContainer\"]/div[2]/div[4]/div[1]/button/p"));

/*Set<String>windowIDS=driver.getWindowHandles();
List<String>windowidsList=new ArrayList(windowIDS);
//Set<String>windowIDS=driver.getWindowHandles();
String parentwidowid=windowidsList.get(0);
String childwindowid= windowidsList.get(1);
driver.switchTo().window(childwindowid);*/
//Mousehover

Actions act = new Actions(driver);
act.moveToElement(w).build().perform();
act.moveToElement(indian).click().perform();
//act.moveToElement(men).click().build().perform();
//\
//act.moveToElement(size).click().build().perform();
try

{
	WebElement mast = driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[2]/a/div[1]/div/div/div/picture/img"));
	act.moveToElement(mast).click().perform();
}
catch(Exception e)
{
System.out.println("ignore mouse");
}




	}

}
