package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class LoginPage extends BaseClass {
	@FindBy(id = "identifierId")WebElement email;
	@FindBy(xpath = "(//button[@jsname='LgbsSe'])[2]")WebElement nextButtn;
	@FindBy(xpath="(//input[@class=\"whsOnd zHQkBf\"])[1]")WebElement passwd;
	@FindBy(xpath ="(//span[@class=\"VfPpkd-vQzf8d\"])[2]") WebElement loginButton;
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle() {
		 return driver.getTitle();
	}
	public Homepage login(String eml , String pswd) throws InterruptedException, IOException {
		email.sendKeys(eml);
		Thread.sleep(3000);
		
		nextButtn.click();
//		WebDriverWait w = new WebDriverWait(driver, 10);
//		w.until(ExpectedConditions.visibilityOf(passwd));
		Thread.sleep(2000);
		passwd.sendKeys(pswd);
		loginButton.click();
		
		return new Homepage();
		
		
		
	}
	
	

}
