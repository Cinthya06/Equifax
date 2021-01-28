package com.equifaxA.StepDefs;

import com.equifaxA.Utilities.ConfigurationReader;
import com.equifaxA.Utilities.UI.Driver;
import cucumber.api.java.Before;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import org.apache.log4j.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    private static Logger logger = Logger.getLogger(Hooks.class);

    @Before
    public void setUp(){
        System.out.println("Getting URL");
        Driver.get().get(ConfigurationReader.getProperty("url"));
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @After
    public void teardown(Scenario scenario) {
//      if test fails takes screenshot
        if (scenario.isFailed()) {
            logger.error("Test failed!");
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } else {
            logger.info("Info : Hooks - teardown");
            logger.info("Test completed!");
        }

        //after every test, we gonna close browser
        Driver.closeDriver();
    }


    }







