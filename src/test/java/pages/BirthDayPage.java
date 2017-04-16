package pages;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Cisco Punns on 4/16/2017.
 */
public class BirthDayPage {
    public static void VerifyText(String texttoFind) {
        $("em").shouldNot(text(texttoFind));
    }
}
