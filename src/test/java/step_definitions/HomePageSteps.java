package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import pages.HomePage;

/**
 * Created by Cisco Punns on 4/16/2017.
 */
public class HomePageSteps {
    @Then("^\"([^\"]*)\" link should not be present$")
    public void linkShouldNotBePresent(String link) {
        HomePage.VerifyLinks(link);
    }
}
