package com.parabank.Base;

import com.parabank.utils.PlaywrightFactory;
import com.microsoft.playwright.Page;
import com.parabank.utils.ConfigReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class BaseTest {

public Page page;
PlaywrightFactory factory;

@BeforeMethod
public void setup()
{
    factory = new PlaywrightFactory();
    String Browser= ConfigReader.get("browser");
     boolean headless = Boolean.parseBoolean(ConfigReader.get("headless"));

    page = factory.initBrowser(Browser);
    page.navigate(ConfigReader.get("baseUrl"));
    page.waitForLoadState();





}

@AfterMethod
public void tearDown()
{
    //factory.closeBrowser(); 
page.context().browser().close();
}


}

