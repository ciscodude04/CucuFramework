package step_definitions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit.ScreenShooter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helpers.Propertycaller;
import org.junit.Rule;


import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.close;

/**
 * Created by Cisco on 3/6/2017.
 */
public class Hooks {
    protected Propertycaller data;
    @Before
    public void openBrowser() {

        try {
            data = new Propertycaller();
//        BasicConfigurator.configure(new NullAppender());
        System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");
        System.setProperty("selenide.browser","Chrome");
        System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tT %4$s %5$s%6$s%n");
        System.out.println("This is in data " + data.gettestUrl());
//            open(data.gettestUrl());
        open("https://jdstartup2017.000webhostapp.com/");
        Configuration.reportsFolder = "src/test/java/screenshots";
        } catch (IOException e) {
//            System.out.println("Cannot call data from Propertycaller");
            e.printStackTrace();
        }
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
