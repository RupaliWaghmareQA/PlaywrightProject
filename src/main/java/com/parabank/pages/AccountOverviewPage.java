package com.parabank.pages;

import com.microsoft.playwright.Page;

public class AccountOverviewPage {



    private Page page;


    // Locators
    private String accountOverviewHeader = "//h1[text()='Accounts Overview']";
    private String accountsTable = "//table[@id='accountTable']";
    private String totalBalance = "//table[@id='accountTable']//td[1]";

    public AccountOverviewPage(Page page)
    {
        this.page=page; 
    }   

    public boolean isAccountOverviewVisible()
    {
        return page.isVisible(accountOverviewHeader);
    }
public String getTotalBalance()
{
    return page.textContent(totalBalance);      


}

public boolean isAccountsTableVisible()
{
    return page.isVisible(accountsTable);
}

}