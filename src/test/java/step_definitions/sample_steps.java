package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Cisco on 2/25/2017.
 */
public class sample_steps {

    @Given("^I click on \"([^\"]*)\"$")
    public void i_click_on(String arg1) {
        $("#Code").click();

    }

    @Then("^I land on coding page$")
    public void i_land_on_coding_page() {
        $("h1").shouldHave(text("Coding"));

    }

    @Given("^I land on \"([^\"]*)\"$")
    public void i_land_on(String arg1) {
        $(By.partialLinkText("Projects")).click();

    }
    @When("^I enter the data$")
    public void i_enter_the_data() {
       $("#response1").setValue("Aerosmith");
       $("#response2").setValue("Something");
       $("#response3").setValue("Something 3");
       $("#response4").setValue("SOmething 5");
       $("#response5").setValue("Something 5");
       $("#response6").setValue("Something 6");
       $("button[type*='button']").click();
    }

    @Then("^I either win or lose$")
    public void i_either_win_or_lose() {
        $(byText("Guess the Band")).shouldBe(visible);

    }

}