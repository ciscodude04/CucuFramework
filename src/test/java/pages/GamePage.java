package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Cisco Punns on 4/15/2017.
 */
public class GamePage {

    public static void EnterData() {
        $("#response1").setValue("Aerosmith");
        $("#response2").setValue("Something");
        $("#response3").setValue("Something 3");
        $("#response4").setValue("SOmething 5");
        $("#response5").setValue("Something 5");
        $("#response6").setValue("Something 6");
        $("button[type*='button']").click();
    }

    public static void clickOnSubmitButton() {
        $("button[type*='button']").click();
    }

    public static void checkResults() {
        $("#calculation").shouldHave(text("Better luck next time"));
    }
}
