package Xpathdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Productxpathname {

	public static void main(String[] args) throws InterruptedException 
	{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
//driver.get("https://demo.opencart.com/");
//String productname = driver.findElement(By.xpath("//a[text()='MacBook']")).getText();
//System.out.println(productname);
driver.get("https://www.amazon.in/");
driver.findElement(By.id("nav-logo-sprites")).click();
driver.findElement(By.className("_deals-shoveler-v2_style_dealImage__3nlqg")).click();
String name = driver.findElement(By.xpath("//body/div[@id='a-page']/div[@class='a-container background-gary-1']/div[@class='a-section safe-width margin-auto-left-and-right']/div[@class='a-section background-white octopus-dlp-body-component']/div[@class='a-fixed-left-grid a-spacing-none']/div[@class='a-fixed-left-grid-inner']/div[@class='a-fixed-left-grid-col a-col-right']/div[@class='a-section no-border-radius border-left-only']/div[@id='octopus-dlp-asin-stream']/ul[@class='a-unordered-list a-nostyle a-horizontal a-spacing-none']/li[1]/span[1]/div[1]/div[2]/div[1]/div[1]/span[1]")).getText();
//Thread.sleep(500);
//driver.close();
System.out.println(name);
	}


}
