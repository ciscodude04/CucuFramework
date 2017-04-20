package step_definitions;

import com.codeborne.selenide.Selenide;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helpers.Drivers;
import org.openqa.selenium.WebDriverException;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Cisco on 3/6/2017.
 */
public class Hooks{

    @Before
    public void openBrowser() {
        Drivers.Initialize("chrome", "https://jdstartup2017.000webhostapp.com/", "");
    }

    @After
    public void embedScreenshot(Scenario scenario) {

        if (scenario.isFailed()) {
            try {
                String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
                String.format(Selenide.screenshot(scenario.getName() + "_" + timeStamp));
            } catch (WebDriverException somePlatformDontSupportScreenshots) {
            }
        }
        Drivers.Close();
    }

}
