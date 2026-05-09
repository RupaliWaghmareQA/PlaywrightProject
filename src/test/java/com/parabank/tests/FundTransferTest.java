package com.parabank.tests;

public class FundTransferTest extends BaseTest
{
    private Playwright playwright;
    private Browser browser;
    private BrowserContext context;
    private Page page;



    @BeforeMethod
    public void initPageAndLogin()
    {
       context = browser.newContext();
       page = context.newPage();
       loginPage = new LoginPage(page);
         loginPage.login("john", "demo");   
       FundTransferPage fundTransferPage = new FundTransferPage(page);
    }




    @Test(priority = 1, description = "Verify successful fund transfer between accounts")
    public void testFundTransfer()
    {
        FundTransferPage fundTransferPage = new FundTransferPage(page);
        fundTransferPage.navigateToFundTransferPage();
        fundTransferPage.fillFundTransferForm("100", "12345", "54321");
        fundTransferPage.clickSubmit();
        Assert.assertTrue(fundTransferPage.isTransferSuccessful(),
         "Fund transfer was not successful");
         
    }
}
