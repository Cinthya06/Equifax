package com.equifaxA.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "com/equifaxA/StepDefs",
        dryRun = false,
        tags = "@amazonSearch",
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json",
        }
)

public class CukesRunner {

}
