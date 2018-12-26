package com.acttime.objrepository;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Login {
	
@FindBy(xpath="//input[@id='username']")
private WebElement usernameedit;

@FindBy(xpath="//input[@name='pwd']")
private WebElement passwordedit;

@FindBy(xpath="//div[text()='Login ']")
private WebElement lgnbtn;

public void logintoapp(String username,String password)
{
	usernameedit.sendKeys(username);
	passwordedit.sendKeys(password);
	lgnbtn.click();
}
}
