package Ecommerce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatorsdemo1 {

	public static void main(String[] args) 
	{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
//open the application
driver.manage().window().maximize(); //maximize brwoser windows
driver.get("https://www.amazon.in/");
//Search box
//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("T-shirts");
//search button
//driver.findElement(By.id("nav-search-submit-button")).click();
//link test & Partial link test
//driver.findElement(By.linkText("Men's Graphic Regular Fit T-Shirt (16960-0943_Black Beauty S)")).click();
//driver.findElement(By.partialLinkText("(16960-0943_Black Beauty S)")).click();
driver.findElement(By.id("nav-logo-sprites")).click();
//FInding total no of sliders
List <WebElement>sliders =driver.findElements(By.className("a-carousel-card"));
	System.out.println("No of sliders:"+sliders.size());
	
//FInding total number of images on homepage
List <WebElement>images = driver.findElements(By.tagName("img"));
System.out.println("Total no of images:"+images.size());
//Find total number of links
List <WebElement>links=driver.findElements(By.tagName("a"));
System.out.println("Total no links:"+links.size());
driver.quit();
	








	}

}
