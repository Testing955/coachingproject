package CssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectorsDemo 
{
public static void main(String args[])
{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
//driver.findElement(By.id("nav-logo-sprites")).click();
//driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Mobile");    //with tag name input  //tag with id
//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Mobile");  //without tag name 
//driver.findElement(By.cssSelector("input.nav-input")).sendKeys("Macbook");   //with tag name input  //tag with class
//driver.findElement(By.cssSelector(".nav-input")).sendKeys("Macbook");  //without tag name 
//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Iphone");    //with tag name input  //tag with attribute id type
//driver.findElement(By.cssSelector("[type='text']")).sendKeys("Iphone");    //without tag name 
//driver.findElement(By.cssSelector("input[type = 'text']")).sendKeys("Iphone");
//driver.findElement(By.cssSelector("[placeholder = 'Search Amazon.in']")).sendKeys("Car");
//driver.findElement(By.cssSelector("input.nav-input.nav-progressive-attribute[name=\'field-keywords\']")).sendKeys("Headphone");
driver.findElement(By.cssSelector(".nav-input.nav-progressive-attribute[name=\'field-keywords\']")).sendKeys("Pen");
}
}
