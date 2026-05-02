package com.parabank.pages;
import com.microsoft.playwright.Page;

public class RegisterPage  {


    private Page page;
private String firstNameField = "//input[@id='customer.firstName']";
private String lastNameField = "//input[@id='customer.lastName']";
private String addressField = "//input[@id='customer.address.street']";
private String cityField = "//input[@id='customer.address.city']";
private String stateField = "//input[@id='customer.address.state']";
private String zipCodeField = "//input[@id='customer.address.zipCode']";
private String phoneField = "//input[@id='customer.phoneNumber']";
private String ssnField = "//input[@id='customer.ssn']";
private String usernameField = "//input[@id='customer.username']";
private String passwordField = "//input[@id='customer.password']";  
private String confirmPasswordField = "//input[@id='repeatedPassword']";
private String registerBtn = "//input[@value='Register']";  
private String successMsg = "//h1[text()='Welcome to Parabank']";

public RegisterPage(Page page)
{
    this.page=page;         

}

public void navigateToRegisterPage()
{
    page.click("//a[text()='Register']");   
}

public void fillRegistrationForm(String firstName, String lastName, String address, String city, String state, String zipCode, String phone, String ssn, String username, String password)
{
    page.fill(firstNameField, firstName);
    page.fill(lastNameField, lastName);
    page.fill(addressField, address);
    page.fill(cityField, city);
    page.fill(stateField, state);
    page.fill(zipCodeField, zipCode);
    page.fill(phoneField, phone);
    page.fill(ssnField, ssn);
    page.fill(usernameField, username);
    page.fill(passwordField, password);
    page.fill(confirmPasswordField, password); 
}

public void clickRegister()
{
    page.click(registerBtn);
}

public boolean isRegistrationSuccessful()
{
    return page.isVisible(successMsg);
}

}
