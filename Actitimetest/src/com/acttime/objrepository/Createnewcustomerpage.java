package com.acttime.objrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Createnewcustomerpage {
	////input[@placeholder='Enter Customer Name'] .//*[@id='customerLightBox_nameField']
@FindBy(xpath="//div[@id='popupContentLoadingPlaceholder']/div/div/div[@class='innerContent']/div[@id='customerLightBox_customerInfoDiv']/div[@id='customerLightBox_customerNameDiv']/input[@id='customerLightBox_nameField']")
private WebElement customernameeditbtn;

@FindBy(xpath="//textarea[@placeholder='Add Customer Description']")
private WebElement customerdescedit;

@FindBy(xpath="//span[text()='Create Customer']")
private WebElement createnewcustomersubmitbtn;

public void createcustomer(String customerName)
{
customernameeditbtn.sendKeys(customerName);	
createnewcustomersubmitbtn.click();
}

public void createcustnamedesc(String Customername,String custdesc)
{
customernameeditbtn.sendKeys(Customername);	
customerdescedit.sendKeys(custdesc);
createnewcustomersubmitbtn.click();
}
}
