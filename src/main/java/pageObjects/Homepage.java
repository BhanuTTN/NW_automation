package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class Homepage extends BaseClass {

	WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(20));

	@FindBy(xpath = "(//input[@placeholder=\"Search for Newers, Posts and Hashtags\"])[1]")
	WebElement searchNewer;

	@FindBy(xpath = "(//a[@routerlinkactive='active' and @href='/home'])[1]")
	WebElement NWlogo;

	@FindBy(css = ".mat-tooltip-trigger.log_ticket_icon[mattooltip='Log Ticket']")
	WebElement ticketbtn;

	@FindBy(css = ".mat-tooltip-trigger.notification_icon")
	WebElement notibtn;

	@FindBy(css = ".mat-tooltip-trigger.newer_word_icon")
	WebElement appdrawerbtn;

	@FindBy(css = "app-profile-picture[imagefor='header'] img[alt='Profile Pic']")
	WebElement profilebtn;

	@FindBy(xpath = "//span[contains(text(),'Manage My Time')]")
	WebElement managemytime;

	@FindBy(xpath = "//span[contains(text(),'My Tickets')]")
	WebElement mytickets;

	@FindBy(xpath = "//span[contains(text(),'Important Links')]")
	WebElement implinks;

	@FindBy(xpath = "//span[contains(text(),'Org Chart')]")
	WebElement orgchart;

	@FindBy(css = ".page_heading")
	WebElement header;

	@FindBy(css = "input[placeholder='What’s on your mind?']")
	WebElement createpost;

	@FindBy(css = "div[class='other_options'] span[class='more_icon']")
	WebElement moreiconbtn;

	@FindBy(className = "feedback")
	WebElement feedbackbtn;

	@FindBy(id = "auto_tour")
	WebElement autotourbtn;
	
	@FindBy(css = "img[alt='favicon']")
	WebElement ttnlogo;
	
	@FindBy(css="app-nav[class='ng-star-inserted'] nav app-footer footer span")
	WebElement ttnfooter;

	public Homepage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public String ValidateTitle() throws InterruptedException {
		wd.until(ExpectedConditions.visibilityOf(searchNewer));
		return driver.getTitle();
	}

	public boolean validatenotificatoinBtn() {
		return notibtn.isDisplayed();

	}

	public String validateHeader() {
		String s = header.getText();
		return s;
	}

	public boolean validatenwLogo() {
		return NWlogo.isDisplayed();
	}

	public boolean validatecreateTicketbtn() {
		return ticketbtn.isDisplayed();
	}

	public boolean validateappdrawerbtn() {
		return appdrawerbtn.isDisplayed();
	}

	public boolean validateprofilebtn() {
		return profilebtn.isDisplayed();
	}

	public boolean validatemanagetime() {
		return managemytime.isDisplayed();
	}

	public boolean validateMyTicket() {
		return mytickets.isDisplayed();
	}

	public boolean validateImpLinks() {
		return implinks.isDisplayed();
	}

	public boolean validateOrgChart() {
		return orgchart.isDisplayed();
	}

	public boolean validateSearchBar() {
		return searchNewer.isDisplayed();
	}

	public CreateTicket createNewTicket() {
		return createNewTicket();
	}

	public boolean validateCreatepost() {
		return createpost.isDisplayed();
	}

	public boolean validateMoreIcon() {
		return moreiconbtn.isDisplayed();
	}

	public boolean validatefeedbackbtn() {
		Actions ac = new Actions(driver);
		ac.moveToElement(feedbackbtn).perform();
		return feedbackbtn.isDisplayed();
	}

	public boolean validateAutotourbtn() {
		Actions ac = new Actions(driver);
		ac.moveToElement(feedbackbtn).perform();
		return moreiconbtn.isDisplayed();
	}

	public searchNewerResult searchNewerfunc() {
		searchNewer.sendKeys("Bhanu gusain");
		searchNewer.sendKeys(Keys.ENTER);
		return new searchNewerResult();
	}
}
