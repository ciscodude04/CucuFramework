package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;

/**
 * Created by Cisco Punns on 4/16/2017.
 */
public class HomePageSteps {
    @Then("^\"([^\"]*)\" link should not be present$")
    public void linkShouldNotBePresent(String link) {
        HomePage.VerifyLinks(link);
    }

    @When("^I see the menu$")
    public void iSeeTheMenu() {
        HomePage.MenuPresent();
    }
}
