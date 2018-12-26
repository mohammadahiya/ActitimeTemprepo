package com.acttime.objrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Activecustomersandprojectpage {
	// //div[@id='createCustomerDiv']/div/div/div/span[text()='Create Customer']  //span[@unselectable='on' and text()='Create Customer']
@FindBy(xpath="//span[text()='Create Customer']")
private WebElement createcustomerbtn;

@FindBy(xpath="//span[@class='successmsg']")
private WebElement sucmsg;

public WebElement getsucmsg()
{
return sucmsg;	
}

public void navigatetocreatenewcustomerpage()
{
	while(true)
{
		try{
			createcustomerbtn.click();
			break;
		}
		catch (Exception e) {
			System.out.println("createnewcustbtnWait");
		}
		}
	
}
}
