package com.parabank.pages;

import com.microsoft.playwright.Page;

public class LoginPage {

private Page page;

    // Locators
private String userNamefield = "//input[@name='username']";
private String passwordfield ="//input[@name=\"password\"]";
private String loginbtn ="//input[@type=\"submit\"]";

private String errorMsg ="//p[@class='error']";


//p[@class="error"]


public LoginPage(Page page)
{
    this.page=page; 
}


public void enterUsername(String userName)
{
    page.fill(userNamefield, userName);
}

public void enterPassword(String password)
{
    page.fill(passwordfield, password); 

}


public void clickLogin()
{
    page.click(loginbtn);

}

public void login(String userName, String password)
{
    enterUsername(userName);
    enterPassword(password);
    clickLogin();


}

public boolean isErrorMessageDisplayed()
{
    return page.isVisible(errorMsg);

}


public String getErrorMessageText()
{
    return page.textContent(errorMsg);  
}

}
