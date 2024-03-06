package Conditionalcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class conditionalscommands 
{
public static void main(String args[]) throws InterruptedException
{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
//driver.get("https://www.amazon.in/");
//isdisplayed and is enabled
//WebElement logo = driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
//System.out.println("Display status of logo:"+logo.isDisplayed());
//boolean status = driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).isDisplayed();
//System.out.println(status);
//WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
//System.out.println("Display Status:"+searchbox.isDisplayed());
//System.out.println("Enable Status:"+searchbox.isEnabled());
//isselected
driver.get("https://www.myntra.com/");
Thread.sleep(10000);
driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys("Tshirt");
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/a/span")).click();
WebElement Men_RButton=driver.findElement(By.xpath("//label[normalize-space()='Men']"));
WebElement Women_RButton=driver.findElement(By.xpath("//label[normalize-space()='Women']"));
//Before selection
System.out.println("Before selection..............");
System.out.println("Men Radio Button Selected: " + Men_RButton.isSelected()); // False return
System.out.println("Women Radio Button Selected: " + Women_RButton.isSelected()); // False return

//After selection of male radio button
System.out.println("After selection of men radio button......................");
Men_RButton.click();
Thread.sleep(5000);
System.out.println("Men Radio Button Selected: " + Men_RButton.findElement(By.xpath("./input")).isSelected()); // True return
System.out.println("Women Radio Button Selected: " + Women_RButton.findElement(By.xpath("./input")).isSelected()); // False return

Thread.sleep(5000);

//After selection of Women radio button
System.out.println("After selection of Women radio button......................");
Women_RButton.click();
Thread.sleep(5000);
System.out.println("Men Radio Button Selected: " + Men_RButton.findElement(By.xpath("./input")).isSelected()); // False return
System.out.println("Women Radio Button Selected: " + Women_RButton.findElement(By.xpath("./input")).isSelected()); // True return
}
}
