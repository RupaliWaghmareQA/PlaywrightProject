package com.parabank.tests;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.parabank.Base.BaseTest;
import com.parabank.pages.AccountOverviewPage;

public class AccountOverviewTest extends BaseTest {
    @Test (priority = 3, description = "Verify account overview page is displayed correctly after login")
    public void testAccountOverview()
    {
       AccountOverviewPage accountOverviewPage = new AccountOverviewPage(page);
      Assert.assertTrue(accountOverviewPage.isAccountOverviewVisible(),
     "Account overview page is not displayed correctly after login");

   
        // This test will verify that the account overview page is displayed correctly after login
    }   


    @Test(priority = 4, description = "Verify total balance is displayed correctly in account overview")
    public void testAccountBalance()
    {
       AccountOverviewPage accountOverviewPage = new AccountOverviewPage(page);
        Assert.assertTrue(accountOverviewPage.isAccountsTableVisible(),
            "Accounts table is not displayed correctly in account overview");

        String totalBalance = accountOverviewPage.getTotalBalance();
        Assert.assertNotNull(totalBalance, "Total balance is not displayed in account overview");   
    }



    
      
}
