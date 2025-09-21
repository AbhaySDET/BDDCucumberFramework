package com.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bdd.utility.BaseTest;
import com.bdd.utility.Utility;

public class LoginPage extends BaseTest {
	
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement txtEmail;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement txtPwd;
	
	@FindBy(xpath="//div[text()='Login']")
	public WebElement btnLogin;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyUserIsONCRMLogINPage(){
	String title=	driver.getTitle();
		System.out.println(title);
	}
	
	public void userEnterCredential() {
		txtEmail.sendKeys(Utility.readConfig("USEREMAIL"));
		
		txtPwd.sendKeys(Utility.readConfig("USERPWD"));
	}
	
	public void clickLoginBtn() {
		btnLogin.click();
	}
	
	public void verifyUserOnHomePage() {
		System.out.println(driver.getCurrentUrl());
	}
	
	public void verifyHomePageTitle() {
		System.out.println(driver.getTitle());
	}

}
