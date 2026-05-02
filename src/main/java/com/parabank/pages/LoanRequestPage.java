package com.parabank.pages;

import com.microsoft.playwright.Page;

public class LoanRequestPage {
    private Page page;

    // Locators
private String loanAmountField = "//input[@id='amount']";   
private String downPaymentField = "//input[@id='downPayment']";
//private String fromAccountSelect = "//select[@id='fromAccountId']";
private String applyButton = "//input[@value='Apply Now']";
private String approvedMsg= "//h1[text()='Loan Request Processed']";
private String loanAccountId = "//p[contains(text(),'Your new account number is')]";


 private LoanRequestPage(Page page)
    {
        this.page=page; 
 
    }


    public void navigateToLoan()
    {
        page.click("//a[text()='Request Loan']");   
    }

    public void fillLoanForm(String loanAmount, String downPayment)

    {
        page.fill(loanAmountField, loanAmount);
        page.fill(downPaymentField, downPayment);   
     
    }
public void clickApply()
{
    page.click(applyButton);
    
}
public boolean isLoanApproved()
{
    return page.isVisible(approvedMsg);
}

public String getLoanAccountId()
{
    return page.textContent(loanAccountId);  
}

}