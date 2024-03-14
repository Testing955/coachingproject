package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class impilicitwaitdemo {

	public static void main(String[] args) 
	{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://icontentpro.hestawork.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[2]/div/div/div[3]/div[2]/input")).sendKeys("princehestabit7@gmail.com");
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[2]/div/div/div[5]/input")).sendKeys("Qwerty@1");
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[2]/div/div/div[6]/div/div")).click();
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[1]/div/div/div[1]/a[2]")).click();
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div[2]")).click();
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Rahul");
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div[1]/div[2]/div/div[2]/input")).sendKeys("Singh");
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/input")).sendKeys("hestabitt@gmail.com");
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/input")).sendKeys("7470828350");
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div[3]/div/div")).click();
//driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div[4]/div[2]/div")).click();
driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div[4]/div[1]")).click();





	}

}
