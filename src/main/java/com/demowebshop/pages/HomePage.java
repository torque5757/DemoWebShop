package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.utilities.TestHelperUtility;
import com.demowebshop.utilities.WaitUtility;

public class HomePage extends TestHelperUtility {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//private final String _subscribeEmailField = "newsletter-email";
	@FindBy(id = "newsletter-email")
	 WebElement subscribeEmailField;
	//@FindBy(id = _subscribeEmailField)
	
	//private WebElement subscribeEmailField;
	//private final String _subscribeBtn = "newsletter-subscribe-button";
	@FindBy(id = "newsletter-subscribe-button")
	 WebElement subscribeBtn;
	//private final String _subscribeMsg = "newsletter-result-block";
	@FindBy(id ="newsletter-result-block")
	 WebElement subscribeMsg;
	private final String _loginLink = "//a[@class='ico-login']";
	@FindBy(xpath =_loginLink)
	private WebElement loginLink;
	
	public void enterSubscribeEmailId() {
		String emailId = random.getRandomEmail();
		page.enterText(subscribeEmailField, emailId);

	}

	public void clickOnSubscribeBtn() {
		subscribeBtn.click();
		
	}
public String getSubscribeMessage()
{
	//wait.waitForElementToBeVisible(driver,subscribeMsg, WaitUtility.LocatorType.Id);
	//wait.waitForElementToBeVisible(driver, getSubscribeMessage(), WaitUtility.LocatorType.Id);
	//String 
	wait.setHardWait();
	//message = page.getElementText(subscribeMsg);
	String message = subscribeMsg.getText();
	return message;	
}
public LoginPage clickOnLoginMenu()
{
	page.clickOnElement(loginLink);
	return new LoginPage(driver);
}
}
