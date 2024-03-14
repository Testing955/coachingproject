package Selectdropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggestdropdown {

	public static void main(String[] args) throws InterruptedException 
	{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://www.google.co.in/");
driver.findElement(By.name("q")).sendKeys("Selenium");
Thread.sleep(3000);
List<WebElement>list = driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));
System.out.println("Number of suggestions: "+list.size());
for(int i =0; i<list.size();i++)
{
//System.out.println(list.get(i).getText());   //print all the elements
//click specific elements
	String text = list.get(i).getText();
	if(text.equals("selenium python"))
			{
		list.get(i).click();
		break;
			}
			
}

	}

}
