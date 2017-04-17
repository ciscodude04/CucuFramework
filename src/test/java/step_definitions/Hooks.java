package step_definitions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriverException;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.codeborne.selenide.Selenide.open;


/**
 * Created by Cisco on 3/6/2017.
 */
public class Hooks{

    @Before
    public void openBrowser() {
        //TODO: This is the startup for Selenide
        System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");
        System.setProperty("selenide.browser","chrome");
        System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tT %4$s %5$s%6$s%n");
        open("https://jdstartup2017.000webhostapp.com/");
        Configuration.reportsFolder = "src/test/screenshots";
        Configuration.screenshots = false;
    }

    @After
    public void embedScreenshot(Scenario scenario) {

        if (scenario.isFailed()) {
            try {
                String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
                String.format(Selenide.screenshot(scenario.getName() + "_" + timeStamp));
            } catch (WebDriverException somePlatformDontSupportScreenshots) {
//                logger.info(somePlatformDontSupportScreenshots);
            }
        }
        Selenide.close();
    }

}
