package Statictable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class statictablelist {

	public static void main(String[] args) 
	{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://testautomationpractice.blogspot.com/");
//find total number of rows   (1)
//Approach 1
/*List<WebElement> rows =driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
System.out.println("Number of rows: "+ rows.size()); */ // no of rows 7
//Approach 2
int Rows =driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
System.out.println("Number of rows: "+ Rows);   // no of rows 7

//Approach 3
/*int rows =driver.findElements(By.tagName("tr")).size();   //This method is only valid if we use single table on the webpage
System.out.println("Number of rows: "+ rows);*/

//finding total number of columns (2)
int Col = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
System.out.println("Total no of col: " + Col );
//finding total no of col in specific column (3)
/*int columns=driver.findElements(By.xpath("//table[@name='BookTable']//tr[3]//td[1 ]")).size();
System.out.println("Total number of coulmns: " + columns);*/

//Approach 4 (Read data from all rows and columns)
for(int r = 2; r<=Rows; r++)
{
for(int c =1; c<=Col;c++)
{
	String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
	System.out.print(value+"\t");
}
System.out.println();
}

//5 Print books name and author name whose start with amit
for(int r =2; r<=Rows; r++)
{
	String book = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
	if(book.equals("Amit"))
	{
String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
System.out.println(book+"  "+bookname);
	}
}

//6 Printing the sum 
int sum = 0;
for(int r = 2; r<=Rows; r++)
{
String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
sum = sum+Integer.parseInt(price);


}
System.out.println("Total price of Books: "+ sum);
	}


}
