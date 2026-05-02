package com.parabank.pages;
import com.microsoft.playwright.Page;

public class TransferFundsPage {



    private Page page;

    private TransferFundsPage(Page page)
    {
        this.page=page; 
    }

    // Locators
    private String amountField = "//input[@id='amount']";
    private String fromAccountSelect = "//select[@id='fromAccountId']";
    //private String toAccountSelect = "//select[@id='toAccountId']";
    private String transferButton = "//input[@value='Transfer']";   
 private String successHeading = "//h1[text()='Transfer Funds Confirmation']";

 public void navigateToTransferFundsPage()
 {
        page.click("//a[text()='Transfer Funds']");
 }

    public void enterAmount(String amount)
    {
        page.fill(amountField, amount);
    }

    public void selectFromAccount(String accountIndex)
    {
        page.selectOption(fromAccountSelect,new com.microsoft.playwright.options.SelectOption()
                .setIndex(Integer.parseInt(accountIndex)));
    }

public void clickTransfer()
{
    page.click(transferButton);
}

public boolean isTransferSuccessful()
{
    return page.isVisible(successHeading);
}

}

