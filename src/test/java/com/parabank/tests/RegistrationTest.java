package com.parabank.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.parabank.Base.BaseTest;
import com.parabank.pages.RegisterPage;
import com.parabank.utils.TestDataReader;

public class RegistrationTest extends BaseTest {

    //Filing Registration form with valid data and verifying successful registration

    @Test (description = "Verify new user registration")
    public void testUserRegistration()
    {
        RegisterPage registerPage = new RegisterPage(page);
        registerPage.navigateToRegisterPage();
        registerPage.fillRegistrationForm(
            TestDataReader.get("newUser" ,"firstName"),
            TestDataReader.get("newUser" ,"lastName"),
            TestDataReader.get("newUser" ,"address"),              
            TestDataReader.get("newUser" ,"city"),
            TestDataReader.get("newUser" ,"state"),
            TestDataReader.get("newUser" ,"zipCode"),
            TestDataReader.get("newUser" ,"phone"),
            TestDataReader.get("newUser" ,"ssn"),
            TestDataReader.get("newUser" ,"username"), 
            TestDataReader.get("newUser" ,"password")
                );  

                registerPage.clickRegister();
                Assert.assertTrue(registerPage.isRegistrationSuccessful(),
                
                "Your account was created successfully. You are now logged in.");
                
    }   



}
