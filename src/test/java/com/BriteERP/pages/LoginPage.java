package com.BriteERP.pages;

import com.BriteERP.utilities.BrowserUtils;
import com.BriteERP.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(linkText = "Sign in")
    public WebElement signinButton;

    @FindBy(id = "login")
    public WebElement userNameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(className = "btn btn-primary")
    public WebElement loginButton;

    @FindBy(className = "alert alert-danger")
    public WebElement warningMessage;

    public LoginPage() {

        PageFactory.initElements(Driver.get(), this);
    }
    public void login(String userName, String password){
        signinButton.click();
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(password, Keys.ENTER);
        BrowserUtils.wait(3);
    }
}
