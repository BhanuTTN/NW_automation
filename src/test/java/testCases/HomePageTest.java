package testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.Homepage;
import pageObjects.searchNewerResult;

public class HomePageTest extends BaseClass {
	Homepage homePage;
	searchNewerResult result;

	public HomePageTest() throws IOException {
		super();
	}

	@Test
	public void homePageTitleTest() throws IOException, InterruptedException {
		homePage = new Homepage();
		Thread.sleep(3000);
		String title = homePage.ValidateTitle();
		assertEquals(title, "Home");

	}

	@Test
	public void nwLogotest() {
		assertTrue(homePage.validatenwLogo());
	}

	@Test
	public void verifyLogTicket() {
		assertTrue(homePage.validatecreateTicketbtn());

	}

	@Test
	public void searchBar() {
		assertTrue(homePage.validateSearchBar());

	}

	@Test
	public void notification() {
		assertTrue(homePage.validatenotificatoinBtn());

	}

	@Test
	public void checkHeader() {
		assertEquals(homePage.validateHeader(), "Welcome, Bhanu Gusain");

	}
}
