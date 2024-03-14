package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertwithpopup {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert alertwindow = driver.switchTo().alert();
		System.out.println(alertwindow.getText());
		alertwindow.sendKeys("Windows 0");
	//	alertwindow.accept();
		alertwindow.dismiss();
		//validation
	String act_text = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
	String exp_text = "You entered: Windows 0";
	if(act_text.equals(exp_text))
	{
	System.out.println("Test passed");
	}
	else
	{
	System.out.println("Test failed");
	}


	}

}
