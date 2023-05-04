package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class CreateTicket extends BaseClass {

	// log ticket
	@FindBy(css = "#mat-input-5")
	WebElement tickettype;

	@FindBy(css = "#mat-input-6")
	WebElement tickettitle;

	@FindBy(css = "#mat-input-13")
	WebElement description;

	@FindBy(xpath = "(//button[@class='secondary_button'])[1]")
	WebElement submitbtn;

	@FindBy(xpath = "(//span[@class='upload_icon'])[2]")
	WebElement uploadfile;

	public CreateTicket() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	
	
}
