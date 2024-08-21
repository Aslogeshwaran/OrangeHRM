package com.orangeHRM.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.TestBase.BaseClass;

public class LoginPage extends BaseClass{
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
//	private String emailFieldXpathValue="//input[@name='username']";
//	private By emailField=By.xpath(emailFieldXpathValue);
//	
//	private String passwordFieldXpathValue="//input[@name='password']";
//	private By passwordField=By.xpath(passwordFieldXpathValue);
//	
//	private String loginButtonXpathValue="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button";
//	private By loginButton=By.xpath(loginButtonXpathValue);
	
	
	@FindBy(xpath ="//input[@name='username']")private WebElement emailField;
	@FindBy(xpath ="//input[@name='password']")private WebElement passwordField;
	@FindBy(xpath ="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")private WebElement loginButton;
	
	
	@FindBy(xpath ="/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")public WebElement dashBoardIcon;
	
	
	public void enterValueOnEmailField(String emailValue)
	{
		emailField.sendKeys(emailValue);
	}
	
	public void enterValueOnPasswordField(String passwordValue)
	{
		passwordField.sendKeys(passwordValue);
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
}
