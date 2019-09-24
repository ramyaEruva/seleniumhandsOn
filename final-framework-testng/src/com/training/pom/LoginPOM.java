package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.sanity.tests.dropdown;
import com.training.sanity.tests.user;

public class LoginPOM {
	private WebDriver driver; 
	String userNm;
	String pwd;
	
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
	@FindBy(linkText="Site Owner")
	private WebElement dropDown;
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
		userNm=userName;
	}
	public String getUserName() {
		
		return userNm;
	}
		
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
		pwd=password;
	}
	public String getPassword() {
		
		return pwd;
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	public void clickDropDown()
	{
		this.dropDown.click();
	}

}
