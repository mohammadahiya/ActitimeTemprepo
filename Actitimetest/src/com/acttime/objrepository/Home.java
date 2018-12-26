package com.acttime.objrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
@FindBy(xpath="//a[@id='logoutLink']")
private WebElement logoutlnk;
////div[text()='TASKS']/..
@FindBy(xpath="//div[@class='label' and text()='TASKS']")
private WebElement tasksbtn;

public void logout()
{
	while(true)
		try{
			logoutlnk.click();	
			break;
		}
	catch (Exception e) {
		System.out.println("waitlogoutbtn");
	}

}

public void navigatetotask()
{
	while(true)
		try{
			tasksbtn.click();
			break;
		}
	catch (Exception e) {
		System.out.println("waittaskbtn");
	}
	
}
}
