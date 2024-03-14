package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitwaitdemo {

	public static void main(String[] args) 
	{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
//Declearing Explicit wait
WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://www.youtube.com/");
WebElement Search=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search']")));
Search.sendKeys("pyar tera ved movie song");
WebElement Searchbutton=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']//div")));
Searchbutton.click();
WebElement song=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a/yt-formatted-string")));
song.click();

	}

}
