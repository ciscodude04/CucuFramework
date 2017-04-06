package step_definitions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.openqa.selenium.WebDriverException;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.close;

/**
 * Created by Cisco on 3/6/2017.
 */
public class Hooks {

//    static Logger logger = Logger.getLogger(Hooks.class);

    @Before
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver", "C:/ChromeDriver/geckodriver.exe");
        System.setProperty("selenide.browser","chrome");
        System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tT %4$s %5$s%6$s%n");
        open("https://jdstartup2017.000webhostapp.com/");
        Configuration.reportsFolder = "src/test/java/screenshots";
        Configuration.screenshots = false;

    }

    @After
    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                Selenide.screenshot(scenario.getName());
            } catch (WebDriverException somePlatformDontSupportScreenshots) {
//                logger.info(somePlatformDontSupportScreenshots);
            }
        }
        close();
    }
}
