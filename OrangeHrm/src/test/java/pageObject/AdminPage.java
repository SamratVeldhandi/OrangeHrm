package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage extends BasePage {

	public AdminPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//locators
	By admin_user = By.xpath("//a[@class='oxd-main-menu-item active']");
	By admin_username = By.xpath("//input[@class='oxd-input oxd-input--focus']");
	List<WebElement> la = driver.findElements(By.className("oxd-select-text oxd-select-text--active"));
	By emp_name = By.xpath("//input[@placeholder='Type for hints...']");
	By status = By.xpath("//div[@class='oxd-select-text oxd-select-text--focus']");
	
	
	//actions
	
	public void setAdmin()
	{
		driver.findElement(admin_user).click();
		
	}
	
	public void setUser(String name)
	{
		driver.findElement(admin_username).sendKeys(name);
	}
	public void adminUser(String ad)
	{
	
	for(WebElement a : la)
	{
		if(a.getText().equals(ad))
		{
			a.click();
		}
	}
		
	}
	public void setEmpName(String emp)
	{
		driver.findElement(emp_name).sendKeys(emp);
	}
	
	public void setStatus(String st)
	{
	List<WebElement> emp_st =  driver.findElements(status);
	for(WebElement b : emp_st)
	{
		if(b.getText().equals(st))
		{
			b.click();
		}
	}
	
	}

}



