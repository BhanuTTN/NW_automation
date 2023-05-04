package testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.Homepage;
import pageObjects.LoginPage;

public class LoginTest extends BaseClass {
	LoginPage loginpage;
	Homepage homepage;

	public LoginTest() throws IOException {
		super();
	}

	@BeforeTest
	public void Setup() throws InterruptedException, IOException {
		launchApp();
		loginpage = new LoginPage();
	}

	@Test
	public void loginPageTitleTest() {
		String title = loginpage.validateTitle();
		assertEquals(title, "Social");
	}

	@Test
	public void logindetail() throws InterruptedException, IOException {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println(homepage.getClass());
	}

	@AfterTest
	public void close() {
		driver.quit();
	}

}
