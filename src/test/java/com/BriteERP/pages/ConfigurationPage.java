package com.BriteERP.pages;



import com.BriteERP.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfigurationPage extends BasePage{

    @FindBy(css = "[data-menu='261']")
    public WebElement crmModule;

    @FindBy(xpath = " (//div[@class='oe_secondary_menu_section'])[6]")
    public WebElement ConfigurationSubTitle;

    @FindBy(className = "//o_web_client o_no_chat_window oe_wait")  //o_web_client o_no_chat_window oe_wait
    public WebElement loadingMask2;

// o_web_client o_no_chat_window oe_wait   loader mask

    public boolean waitUntilLoadingMaskDisappear2() {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 30);
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("o_web_client o_no_chat_window oe_wait  ")));
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Loader mask not found!");
            e.printStackTrace();
            return true;
        } catch (WebDriverException e) {
            e.printStackTrace();
        }
        return false;
    }


}

