package PAGEOBJECTMODEL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 
{
public WebDriver driver;
//constructor
Loginpage2(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver,this);
}
//Web Elements locators + identification
//@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div[2]/img")
@FindBy(how=How.XPATH, using="/html/body/div/div/div/div/div/div/div/div/div[2]/img")
WebElement img_logo;
@FindBy(name="email")
WebElement txt_username;
@FindBy(css="#password")
WebElement txt_password;
@FindBy(xpath="//button[normalize-space()='Login']")
WebElement btn_submit;

public void setUserName(String username)
{
txt_username.sendKeys(username);
}
public void clickLogin()
{
	btn_submit.click();
}
public void setPassword(String password)
{
	txt_password.sendKeys(password);
}
public boolean checkLogoPresence()
{
boolean status = img_logo.isDisplayed();
return status;
}
}


