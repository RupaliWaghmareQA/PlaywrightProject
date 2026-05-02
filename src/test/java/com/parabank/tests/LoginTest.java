package com.parabank.tests;
import com.parabank.pages.AccountOverviewPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.parabank.Base.BaseTest;
import com.parabank.pages.LoginPage;
import com.parabank.utils.TestDataReader;

public class LoginTest extends BaseTest{

    @Test (description = "Verify successful login with valid credentials")
    public void testValidLogin()
    {
    LoginPage loginPage = new LoginPage(page);
    loginPage.login(
    
    TestDataReader.get("validUser", "username"),
    TestDataReader.get("validUser", "password"));
    AccountOverviewPage accountOverviewPage = new AccountOverviewPage(page);
    Assert.assertTrue(accountOverviewPage.isAccountOverviewVisible(),
     "Account Overview page is not displayed after login");  

    }



    @Test(description ="Verify error message is displayed for invalid login")
    public void testInvalidLogin()
    {
        LoginPage loginPage = new LoginPage(page);
        loginPage.login(
            TestDataReader.get("invalidUser", "username"),
            TestDataReader.get("invalidUser", "password"));
        
        Assert.assertTrue(loginPage.isErrorMessageDisplayed(),
         "Error message is not displayed for invalid login");
       
    }
}
