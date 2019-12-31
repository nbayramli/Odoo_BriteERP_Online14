package com.BriteERP.pages;

import com.BriteERP.utilities.BrowserUtils;
import com.BriteERP.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    @FindBy(css ="[class='breadcrumb']> li")
    public WebElement  pageSubTitle;

    @FindBy(className = "o_web_ client oe_wait")
    public WebElement loadingMask;

    public void navigateTo(String module){
        String moduleLocator = "//span[normalize-space()='"+module+"']";
        WebElement tabElement = Driver.get().findElement(By.xpath(moduleLocator));
        new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();

    }

    public String getPageSubTitle() {
        waitUntilLoadingMaskDisappear();
        BrowserUtils.waitForVisibility(pageSubTitle,5);
        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }

    public boolean waitUntilLoadingMaskDisappear() {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 30);
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("o_web_ client oe_wait")));
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
