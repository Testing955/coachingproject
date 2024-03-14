package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frameswebelement {

	public static void main(String[] args)
	{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://ui.vision/demo/webtest/frames/");
//Frame 1
WebElement frm1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
driver.switchTo().frame(frm1);
driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("001247");
driver.switchTo().defaultContent();
//frame2
WebElement frm2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
driver.switchTo().frame(frm2);
driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("PA");
driver.switchTo().defaultContent();

//Frame 3
WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
driver.switchTo().frame(frame3);
driver.findElement(By.name("mytext3")).sendKeys("Ap");
driver.switchTo().frame(0);
driver.findElement(By.cssSelector("div.AB7Lab")).click();
driver.switchTo().defaultContent();

//Frame4
WebElement frame4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
driver.switchTo().frame(frame4);
driver.findElement(By.name("mytext4")).sendKeys("APO");
driver.switchTo().defaultContent();
//Frame 5
WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
driver.switchTo().frame(frame5);
driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("67890");

	}

}
