package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
WebDriver driver;
	
	//constructor
	public BasePage(WebDriver driver)
	{
	this.driver=driver;	
	PageFactory.initElements(driver, this);
	}
	
	
	//Locators
	


	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement txt_username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txt_pwd;
	@FindBy(xpath = "\"//button[normalize-space()='Login']\"")
	WebElement LoginButton;
	
	//actions
	public void setUsername(String user)
	{
		txt_username.sendKeys(user);
	}
	
	public void setPassword(String pwd)
	{
		txt_pwd.sendKeys(pwd);
	}
	public void loginButton()
	{
		LoginButton.click();
	}


}

