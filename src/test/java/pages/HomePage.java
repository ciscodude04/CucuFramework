package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Cisco on 3/6/2017.
 */
public class HomePage {

    public static void ClickOn(String link) {
        $(By.partialLinkText(link)).click();
    }

    public static void VerifyLinks(String link) {
        $(By.partialLinkText(link)).shouldNotBe(visible);
    }
}
