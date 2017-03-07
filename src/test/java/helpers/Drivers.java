package helpers;

/**
 * Created by Cisco on 3/6/2017.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Cisco on 3/6/2017.
 */
public class Drivers {

    public static WebDriver instance;

    public static void initialize(String browser, String url, String env) {
        try {
            Propertycaller data = new Propertycaller();
            data.gettestUrl();
            if(browser.equals("firefox")){
                instance = new FirefoxDriver();
                instance.manage().window().maximize();
                instance.manage().deleteAllCookies();
                instance.get(url);
                instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            }
            if(browser.equals("chrome")){
                System.setProperty("webdriver.chrome.driver", "putlocation");
                System.setProperty("webdriver.chrome.silentOutput", "true");
                instance = new ChromeDriver();
                instance.manage().window().maximize();
                instance.manage().deleteAllCookies();
                instance.get(url);
                instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            }  } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void close(){
        Drivers.instance.close();
    }



}
