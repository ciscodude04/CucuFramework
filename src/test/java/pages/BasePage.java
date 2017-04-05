package pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


/**
 * Created by Cisco on 3/6/2017.
 */
public class BasePage {
    public static void gotohomePage() {
        System.out.println("I got here");
    }

    public static void gotosecondStep() {
        System.out.println("Got to second step");
    }

    public static void gotothirdStep() {
        System.out.println("Got to third step");
//        $("#noname").click();
//        $("#names").shouldHave(size(3));

    }

    public static void createnewAccount() {
        $(".li.li-link-profile").click();
        $(By.partialLinkText("New Registration")).click();
    }

    public static void loggedIn() {
        $("").shouldHave(text("Welcome"));
    }
}
