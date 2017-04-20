package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import helpers.TestDataHelpers;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by Cisco Punns on 4/15/2017.
 */
public class GamePage {

    public static TestDataHelpers dh = new TestDataHelpers();

    public static void EnterData() {
        System.out.println("HERE I AM AND READ IT -----> " + dh.firstName());
        System.out.println("HERE I AM AND READ IT -----> " + dh.lastName());
        $("#response1").setValue(dh.firstName());
        $("#response2").setValue(dh.lastName());
//        sleep(5000);
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
