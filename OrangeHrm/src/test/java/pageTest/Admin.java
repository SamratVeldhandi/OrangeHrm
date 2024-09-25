package pageTest;

import org.testng.annotations.Test;

import pageObject.AdminPage;

public class Admin extends BaseTest {
	@Test()
	void adminTest()
	{
		AdminPage ap = new AdminPage(driver);
		ap.setUsername("Admin");
		ap.setPassword("admin123");
		ap.loginButton();
		ap.setAdmin();
		ap.setUser("Admin");
		ap.adminUser("virat");
		ap.setEmpName("Vrat kohli");
		ap.setStatus("Enabled");
	}

}
