package pageTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.AdminPage;
import pageObject.BasePage;

public class BaseTest {
WebDriver driver;
	
	@Test
	void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		AdminPage ap = new AdminPage(driver);
		ap.setUsername("Admin");
		ap.setPassword("admin123");
		ap.loginButton();
	
				
	}
	

}
