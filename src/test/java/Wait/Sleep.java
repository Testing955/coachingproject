package Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sleep {

	public static void main(String[] args) throws InterruptedException
	{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://icontentpro.hestawork.com/");
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[2]/div/div/div[3]/div[2]/input")).sendKeys("princehestabit7@gmail.com");
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[2]/div/div/div[5]/input")).sendKeys("Qwerty@1");
Thread.sleep(5000);



	}

}
