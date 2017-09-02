package helpers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Cisco Punns on 4/15/2017.
 */
public class Drivers {

    public static void Initialize(String browser, String url, String env) {
        if(browser.equals("chrome")) {

            System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");
            System.setProperty("selenide.browser","chrome");
            open(url);
        }
        else if(browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:/ChromeDriver/geckodriver.exe");
            DesiredCapabilities cap = DesiredCapabilities.firefox();
            cap.setJavascriptEnabled(true);
            cap.setCapability("marionette", true);
            WebDriverRunner.setWebDriver(new FirefoxDriver(cap));
            open(url);
        }
        else if(browser.equals("headless")) {
            //INFO: Need to set JS to true or browser cannot initialize
            WebDriverRunner.setWebDriver(new HtmlUnitDriver(true));
            open(url);
        }
        else if(browser.equals("edge")) {
            //INFO: Need to download appropriate MDriver in order to run Edge browser
            System.setProperty("webdriver.edge.driver", "C:/ChromeDriver/MicrosoftWebDriver.exe");
            EdgeOptions options = new EdgeOptions();
            options.setPageLoadStrategy("eager");
            WebDriverRunner.setWebDriver(new EdgeDriver(options));
            open(url);
        }
        else if(browser.equals("phantomjs")) {
            System.setProperty(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C:/ChromeDriver/phantomjs.exe");
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setJavascriptEnabled(true);
            caps.setCapability("takeScreenshot", true);
            WebDriverRunner.setWebDriver(new PhantomJSDriver(caps));
        }
        Configuration.reportsFolder = "src/test/screenshots";
        Configuration.screenshots = false;

    }

    public static void Close() {
        close();
    }


}

//Need to add applitools eyes for visual automation testing
