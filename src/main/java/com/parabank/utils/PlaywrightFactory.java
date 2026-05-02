package com.parabank.utils;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightFactory {
  
   private Playwright playwright;
    Browser browser;
    BrowserContext context;
    Page page;
    
    public Page initBrowser(String BrowserName)
{ 
    Playwright playwright = Playwright.create();
    browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)
    .setSlowMo(2000));
    

context = browser.newContext();
page = context.newPage();
return page;
}




public void closeBrowser()
{
    //browser.close();

       if (browser != null) browser.close();
        if (playwright != null) playwright.close();
}

}
