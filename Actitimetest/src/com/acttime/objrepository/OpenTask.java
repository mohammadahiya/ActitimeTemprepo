package com.acttime.objrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTask {
@FindBy(linkText="Projects & Customers")
private WebElement projectsandcustomerlink;

public void navigatetoprojectscustpage()
{
projectsandcustomerlink.click();	
}
}
