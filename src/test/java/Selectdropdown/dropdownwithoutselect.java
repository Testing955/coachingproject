package Selectdropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class dropdownwithoutselect {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys("Shoes For Men");
		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/a/span")).click();
		WebElement size=driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[1]/section/div[1]/div[2]/ul/li[3]/label"));
		size.click();
		Thread.sleep(1000);
List<WebElement>options=driver.findElements(By.xpath("//ul[@class='atsa-values']//label"));
System.out.println("Total no of checkboxes: "+options.size());
/*for(int i = 0; i<options.size();i++)
{
System.out.println(options.get(i).getText());
}*/

//Select options from the dropdown
/*for(int i = 0;i<options.size();i++)
{
	String optiontick =options.get(i).getText();
if(optiontick.equals("UK1") || optiontick.equals("11.5-12.5Y"))
{
options.get(i).click();
//break;   //if we want to click the multiple optins then remove Break statement or if we've to select only one then Break statement is ok 
}
}*/

//using enhanced for loop
for(WebElement optiontick:options)
{
String text = optiontick.getText();
if(text.equals("UK1") || text.equals("11.5-12.5Y"))
{
optiontick.click();
}
}
	}

}
