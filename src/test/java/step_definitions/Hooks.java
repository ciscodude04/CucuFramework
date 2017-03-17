package step_definitions;

import cucumber.api.Scenario;
import helpers.Drivers;
import helpers.Propertycaller;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import java.io.IOException;

/**
 * Created by Cisco on 3/6/2017.
 */
public class Hooks extends Drivers {
    public static WebDriver driver;
    @Before
    public void openBrowser() {
        Propertycaller data;
        try {
            data = new Propertycaller();
            System.out.println("Called openBrowser");
            Drivers.initialize("chrome", data.gettestUrl(), null);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public void embedScreenshot(Scenario scenario){
        if(scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + instance.getCurrentUrl());
                byte[] screenshot = ((TakesScreenshot) instance).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformDontSupportScreenshots) {
                System.err.println(somePlatformDontSupportScreenshots.getMessage());
            }
        }
        instance.quit();
    }
}
