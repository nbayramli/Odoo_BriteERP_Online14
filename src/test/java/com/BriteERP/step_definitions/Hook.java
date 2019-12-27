package com.BriteERP.step_definitions;

import com.BriteERP.utilities.Driver;
import io.cucumber.core.api.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {
    @Before
    public void setup(){
        System.out.println("Test setup!");
        Driver.get().manage().window().maximize();
    }
    @After
    public void teardown(Scenario scenario){
        if(scenario.isFailed()) {
            System.out.println("Test Failed");
            byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }else{
            System.out.println("Cleanup!");
            System.out.println("Test Completed");
        }
        Driver.close();
    }

}
