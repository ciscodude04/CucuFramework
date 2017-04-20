package helpers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Cisco Punns on 4/15/2017.
 */
public class Drivers {

    public static void Initialize(String browser, String url, String env) {
        System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tT %4$s %5$s%6$s%n");
        if(browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");
            System.setProperty("selenide.browser","chrome");
//            System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tT %4$s %5$s%6$s%n");
            open(url);
        }
        else if(browser.equals("firefox")) {
            open(url);
        }
        else if(browser.equals("headless")) {
            WebDriverRunner.setWebDriver(new HtmlUnitDriver(true));
            open(url);
        }
        Configuration.reportsFolder = "src/test/screenshots";
        Configuration.screenshots = false;
    }

}
