package pages;

import org.fluttercode.datafactory.impl.DataFactory;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Cisco Punns on 4/15/2017.
 */
public class GamePage {

    public static DataFactory df = new DataFactory();

    public static void EnterData() {
        System.out.println("HERE I AM AND READ IT -----> " + df.getFirstName());
        System.out.println("HERE I AM AND READ IT -----> " + df.getLastName());
        $("#response1").setValue(df.getFirstName());
        $("#response2").setValue(df.getFirstName());
        $("#response3").setValue(df.getFirstName());
        $("#response4").setValue(df.getFirstName());
        $("#response5").setValue(df.getFirstName());
        $("#response6").setValue(df.getFirstName());
        $("button[type*='button']").click();
    }

    public static void clickOnSubmitButton() {
        $("button[type*='button']").click();
    }

    public static void checkResults() {
        $("#calculation").shouldHave(text("Better luck next time"));
    }
}
