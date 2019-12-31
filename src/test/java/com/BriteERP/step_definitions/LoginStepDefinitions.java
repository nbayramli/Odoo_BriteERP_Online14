package com.BriteERP.step_definitions;

import com.BriteERP.pages.LoginPage;
import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("I am on the login page");
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user logs in as Events CRM Manager")
    public void user_logs_in_as_Events_CRM_Manager() {
        System.out.println("Login as Events CRM Manager");
        String userName = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(userName, password);
    }

    @Then("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {
        System.out.println(string);
        loginPage.waitUntilLoadingMaskDisappear();
        Assert.assertEquals(string, loginPage.getPageSubTitle());
        System.out.println("Verifying page subtitle: " + string);
    }


    @Then("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {
        System.out.println("Login with " + string + " username and " + string2 + " password." );
        loginPage.login(string, string2);
    }

    @Given("user verifies that {string} message is displayed")
    public void user_verifies_that_message_is_displayed(String string) {
        System.out.println("Warning message: " + string);
    }
}
