package Mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rightclick 
{

	public static void main(String[] args) throws InterruptedException 
	{
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement button = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
Actions act = new Actions(driver);	
act.contextClick(button).perform();
driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
//Thread.sleep(5000);
driver.switchTo().alert().accept();


	}

}
