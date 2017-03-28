package step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helpers.Drivers;
import helpers.Propertycaller;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

/**
 * Created by Cisco on 3/6/2017.
 */
public class Hooks {
    public static WebDriver driver;
    public static Propertycaller data;

    @Before
    public void openBrowser() throws IOException {
        data = new Propertycaller();
        System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");
        System.setProperty("webdriver.chrome.silentOutput", "true");
        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("https://www.google.com");
//        driver.get(data.getURL());

    }

    @After
    public void embedScreenshot(Scenario scenario){
        if(scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformDontSupportScreenshots) {
                System.err.println(somePlatformDontSupportScreenshots.getMessage());
            }
        }
        driver.quit();
    }
}
