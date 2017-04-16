package pages;

import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Cisco on 3/6/2017.
 */
public class HomePage {

    public static void ClickOn(String link) {
        $("#Project").click();
    }
}
