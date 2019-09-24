package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 

	@FindBy(className = "close")
	private WebElement closeBtn;

	@FindBy(className="dropdown")
	private WebElement dropDown;
	
	@FindBy(id="logout_button")
	private WebElement logoutButton;
	

	@FindBy(className = "homepage")
	private WebElement homePage;
	
	public WebElement homePage() {
		return homePage;
	}
	
	public void clickLogoutButton() {
		logoutButton.click();
	}
	public WebElement getDropDown() {
		return dropDown;
	}

	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	public String getUserName() {
		return userName.getAttribute("value");
	}
		
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password);
	}
	public String getPassword() {
		return password.getAttribute("value");
	}
	
	public void clickCloseBtn() {
		this.closeBtn.click();
	}
	
	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}

	public void clickDropDown()
	{
		this.dropDown.click();
	}

}
