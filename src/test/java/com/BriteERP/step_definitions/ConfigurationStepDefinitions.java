package com.BriteERP.step_definitions;

import com.BriteERP.pages.ConfigurationPage;
import com.BriteERP.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ConfigurationStepDefinitions {

    ConfigurationPage configurationPage = new ConfigurationPage();


    @Then("user navigates to {string}")
    public void user_navigates_to(String string) {

        configurationPage.navigateTo(string);
    }


    @Then("user verifies that {string} submodule is displayed")
    public void user_verifies_that_Configuration_submodule_are_displayed(String string)  {
        System.out.println("Configuration submodule is displayed");
        configurationPage.waitUntilLoadingMaskDisappear2();

        //  BrowserUtils.waitForStaleElement(configurationPage.ConfigurationSubTitle);
        BrowserUtils.waitForPageToLoad(15);
        BrowserUtils.waitForVisibility(configurationPage.ConfigurationSubTitle,15);



        Assert.assertTrue(configurationPage.ConfigurationSubTitle.isDisplayed());


    }

}




