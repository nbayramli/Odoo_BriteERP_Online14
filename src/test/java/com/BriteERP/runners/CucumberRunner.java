package com.BriteERP.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Resources/features",
        glue= "com/BriteERP/step_definitions",
        dryRun = false,
        tags = "@event_scr_manager,  @login_with_credentials_ddt, @negative_test",
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"}
)
public class CucumberRunner {
}
