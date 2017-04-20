package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GamePage;
import pages.HomePage;

/**
 * Created by Cisco on 2/25/2017.
 */
public class GamePageSteps {

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @Given("^I click on \"([^\"]*)\"$")
    public void i_click_on(String link)  {
        HomePage.ClickOn(link);
    }

    @Given("^I enter answers$")
    public void i_enter_answers() {
        GamePage.EnterData();
    }

    @When("^I click on submit button$")
    public void iClickOnSubmitButton() {
        GamePage.clickOnSubmitButton();
    }

    @Then("^I get results$")
    public void i_get_results() {
        GamePage.checkResults();
    }
}
