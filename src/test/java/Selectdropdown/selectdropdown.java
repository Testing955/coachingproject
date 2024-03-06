package Selectdropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectdropdown {

	public static void main(String[] args) throws InterruptedException 
	{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.navigate().to("https://urbansoccermanager-stag.hestalabs.com/login");
driver.findElement(By.name("email")).sendKeys("admin@urbansoccermanager.com");
driver.findElement(By.name("password")).sendKeys("qwerty");
driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[1]/div/div/div/a")).click();
driver.findElement(By.name("game_name")).sendKeys("Fifa 2025");
WebElement dateInput = driver.findElement(By.xpath("(//input[@id='date'])[1]"));
dateInput.click();
//Thread.sleep(5000);
//WebElement desiredDate = driver.findElement(By.xpath(""))
//dateInput.sendKeys("12/14/2023");
driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/div[2]/div/select"));
WebElement drpground = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/div[2]/div/select"));
Select drpgroundlist = new Select(drpground);
//drpgroundlist.selectByVisibleText("Street Soccer Park");
//drpgroundlist.selectByValue("1");      //Select value only can be used when the value is provided on the dom
//Through index
drpgroundlist.selectByIndex(1);

WebElement hometeam=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/div[3]/div[1]/select"));
Select homelist=new Select(hometeam);
homelist.selectByVisibleText("Caring Soccer Club");
//To capture all options of the drop down
List<WebElement>drophomelist=homelist.getOptions();
System.out.println("Print total number of the list:"+ drophomelist.size());

//using enhanced loop
for(WebElement dh:drophomelist)
{
System.out.println(dh.getText());
}

WebElement awayteam= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/div[3]/div[2]/select"));
Select awayteamlist = new Select(awayteam);
awayteamlist.selectByValue("11");
List<WebElement>dropdownaway=awayteamlist.getOptions();
System.out.println("Total no of the list: " + dropdownaway.size());
for(int i =0;i<dropdownaway.size();i++)
{
System.out.println(dropdownaway.get(i).getText());
}




	}

}
