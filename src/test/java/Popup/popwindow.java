package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popwindow {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   //Implicit wait statement
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	//Alert alertwindow = driver.switchTo().alert();
	Alert alertwindow=mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alertwindow.getText());
alertwindow.accept();  // click ok button
//alertwindow.dismiss();
		
				

	}

}
