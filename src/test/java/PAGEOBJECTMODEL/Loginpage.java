package PAGEOBJECTMODEL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Loginpage 
{
public WebDriver driver;
//constructor
Loginpage(WebDriver driver)
{
this.driver=driver;
}
//locators
By img_logo_loc=By.xpath("/html/body/div/div/div/div/div/div/div/div/div[2]/img");
By text_username_loc=By.name("email");
//By button_next_loc=By.xpath("//*[@id=\"idSIButton9\"]");
By text_password_loc=By.name("password");
//By text_title_loc=By.xpath("Sign in to Outlook");
By button_login_loc=By.xpath("/html/body/div/div/div/div/div/div/div/div/div[1]/div/form/div[4]/div[1]/button");
public void setUserName(String username)
{
driver.findElement(text_username_loc).sendKeys(username);
}
public void clickLogin()
{
driver.findElement(button_login_loc).click();
}
public void setPassword(String password)
{
driver.findElement(text_password_loc).sendKeys(password);
}
public boolean checkLogoPresence()
{
boolean status = driver.findElement(img_logo_loc).isDisplayed();
return status;
}
}


