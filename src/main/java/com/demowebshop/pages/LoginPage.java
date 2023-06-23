package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.utilities.TestHelperUtility;

public class LoginPage extends TestHelperUtility
{
public WebDriver driver;
public LoginPage (WebDriver driver)
{
this.driver = driver;
PageFactory.initElements( driver,this);
}
private final String _emailField = "Email";
@FindBy(id =_emailField)
private WebElement emailField;

private final String _passwordField = "Password";
@FindBy(id =_passwordField)
private WebElement passwordField;
private final String _loginBtn = "//input[@class='button-1 login-button']";
@FindBy(xpath =_loginBtn)
private WebElement loginBtn;
private final String _loginErrorMsg = "//div[@class='validation-summary-errors']//span";
@FindBy(xpath =_loginErrorMsg)
private WebElement loginErrorMsg;
public void enterUserCredentials(String email,String pword)
{
page.enterText(emailField, email);	
page.enterText(passwordField, pword);
}
public void clickOnLoginBtn()
{
	loginBtn.click();
}
public String getLoginErrorMessage()
{
	String errorMessage= page.getElementText(loginErrorMsg);
	return errorMessage;
}
}
