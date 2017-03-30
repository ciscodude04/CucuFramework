package step_definitions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit.ScreenShooter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.varia.NullAppender;
import org.junit.Rule;


import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.close;

/**
 * Created by Cisco on 3/6/2017.
 */
public class Hooks {

    @Before
    public void openBrowser() {
//        BasicConfigurator.configure(new NullAppender());
        System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");
        System.setProperty("selenide.browser","Chrome");
        System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tT %4$s %5$s%6$s%n");
        open("https://www.google.com");
        Configuration.reportsFolder = "src/test/java/screenshots";
    }

    @Rule
    public ScreenShooter makeScreenshotOnFailure = ScreenShooter.failedTests();
    @After
    public void embedScreenshot(Scenario scenario){
//        if(scenario.isFailed()) {
//            try {
//                scenario.write("Current Page URL is " + driver.getCurrentUrl());
//                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//                scenario.embed(screenshot, "image/png");
//            } catch (WebDriverException somePlatformDontSupportScreenshots) {
//                System.err.println(somePlatformDontSupportScreenshots.getMessage());
//            }
//        }
//        driver.quit();
        close();
    }
}
