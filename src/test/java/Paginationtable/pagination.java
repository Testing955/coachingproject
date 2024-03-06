package Paginationtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pagination {

	public static void main(String[] args) throws InterruptedException 
	{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.navigate().to("https://demo.opencart.com/admin/");
driver.findElement(By.name("username")).clear();
driver.findElement(By.name("username")).sendKeys("demo");
driver.findElement(By.name("password")).clear();
driver.findElement(By.name("password")).sendKeys("demo");
driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
if(driver.findElement(By.xpath("//*[@id=\"modal-security\"]/div/div/div[1]/button")).isDisplayed())
{
driver.findElement(By.xpath("//*[@id=\"modal-security\"]/div/div/div[1]/button")).click();
}
//Customers-----> Customer
driver.findElement(By.xpath("//*[@id=\"menu-customer\"]/a")).click();
driver.findElement(By.xpath("//*[@id=\"collapse-5\"]/li[1]/a")).click();
//finding total number of the pages
String text = driver.findElement(By.xpath("//*[@id=\"form-customer\"]/div[2]/div[2]")).getText();
//here below code finding the index of total no of the pages by using substring and indexing method
int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
System.out.println("Total number of pages: "+ total_pages);
//Pagination xpath
for(int p=1;p<=2;p++)
{
if(total_pages>1)
{
WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+p+"]"));
System.out.println("Active page: "+active_page.getText());
active_page.click();
Thread.sleep(2000);
}
int noofrows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
System.out.println("Total no of rows: "+ noofrows);
for(int r=1;r<= noofrows;r++)
{
String Customername=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();	
String Customeremail=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();	
String Customerinformation=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();	
System.out.println(Customername+"      "+Customeremail+"        "+Customerinformation);
}
}
driver.quit();


	}
	

}
